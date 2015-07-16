package edu.mum.cs.ds.atm;

import edu.mum.cs.ds.atm.helper.AccountImplementor;
import edu.mum.cs.ds.atm.helper.BillPayImplementor;
import edu.mum.cs.ds.atm.helper.CardImplementor;
import edu.mum.cs.ds.atm.model.Account;
import edu.mum.cs.ds.atm.model.Request;
import edu.mum.cs.ds.atm.model.Response;

public class Reciever {

	private AccountImplementor objAccountHelper = new AccountImplementor();
	private CardImplementor cardImplementor = new CardImplementor();
	private BillPayImplementor billPayImplementor = new BillPayImplementor();

	public Account loadAccount(Request objData) {
		return objAccountHelper.loadAccount(objData);
	}

	public boolean deductAmount(String accountId, double amount) {
		return objAccountHelper.withdraw(accountId, amount);
	}

	public Response withdrawl(Request objData) {
		Response response = new Response();
		boolean isAmountDeducted = deductAmount(objData.getAccountId(),
				objData.getAmount());

		response.setRequest(objData);
		if (isAmountDeducted) {
			response.setMessage("Amount deducted");
			CashDispenseChain cashDispense = new CashDispenseChain();
			if (cashDispense.dispenseCash(objData.getAmount())) {
				response.setRequestSuccess(true);
			} else {
				response.setMessage("Issue with Cash dispense, undo withdraw");
				response.setRequestSuccess(false);
			}
		} else {
			response.setMessage("Issue with Account");
			response.setRequestSuccess(false);
		}
		return response;
		// TODO:: code here which connects to db/service
	}

	public Response undowithdrawl(Request objData) {
		Response response = new Response();
		response.setRequest(objData);
		response.setRequestSuccess(objAccountHelper.acceptPayment(
				objData.getAccountId(), objData.getAmount()));
		response.getRequest().setPin(0);
		return response;
	}

	public Response checkBalanceAction(Request request) {
		Response response = new Response();
		
		String accountId = request.getAccountId();
		request.setAmount(objAccountHelper.checkBalanace(accountId));
		response.setRequestSuccess(true);
		response.setMessage("Transaction check balance success");
		response.setRequest(request);
		response.getRequest().setPin(0);
		return response;
	}

	public Response changePin(Request request) {
		Response response = new Response();
		response.setRequest(request);
		String accountId = request.getAccountId();
		String cardNo = request.getCardNo();
		int newPin = request.getPin();
		if (cardImplementor.changePin(accountId, cardNo, newPin)) {
			response.setRequestSuccess(true);
			response.setMessage("Pin is changed");
			response.getRequest().setPin(0);
		} else {
			response.setRequestSuccess(false);
			response.setMessage("Pin is not changed. Please try again");
			response.getRequest().setPin(0);
		}
		return response;
	}

	public Response acceptPayment(Request request) {
		Response response = new Response();
		response.setRequest(request);
		String accountId = request.getAccountId();
		double topUpAmount = request.getAmount();
		if (objAccountHelper.acceptPayment(accountId, topUpAmount)) {
			response.setRequestSuccess(true);
			response.setMessage("Payment is accepted");
			response.getRequest().setPin(0);
		} else {
			response.setRequestSuccess(false);
			response.setMessage("Payment is not accepted");
			response.getRequest().setPin(0);
		}
		return response;
	}

	public Response payBill(Request request) {
		Response response = new Response();
		response.setRequest(request);
		String billId = request.getBillId();
		if (billPayImplementor.payBill(request.getAccountId(), billId)) {
			response.setRequestSuccess(true);
			response.setMessage("Payment is accepted");
			response.getRequest().setPin(0);
		} else {
			response.setRequestSuccess(false);
			response.setMessage("Payment is not accepted");
			response.getRequest().setPin(0);
		}
		return response;
	}

	public Response payBillAndDeductAmout(Request request) {
		boolean isDeducted = deductAmount(request.getAccountId(), request.getAmount());
		Response response = new Response();
		response.setMessage("Error Bill pay");
		response.setRequest(request);
		if(isDeducted){
			response.setMessage("Amount deducted");
			response = payBill(request);
			if(response.isRequestSuccess()) {
				response.setMessage("Bill Payment and Amount deducted");
				return response;
			}
		}else{
			response.setMessage("Isse with Amount, will u");
			return response;
		}
		return response;
	}
}
