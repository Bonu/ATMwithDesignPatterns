package edu.mum.cs.ds.atm;

import edu.mum.cs.ds.atm.helper.AccountImplementor;
import edu.mum.cs.ds.atm.helper.CardImplementor;
import edu.mum.cs.ds.atm.model.Account;
import edu.mum.cs.ds.atm.model.Request;

public class Reciever {
	
	private AccountImplementor objAccountHelper = new AccountImplementor();
	private CardImplementor cardImplementor = new CardImplementor();
	
	public Account loadAccount(Request objData)
	{
		return objAccountHelper.loadAccount(objData);
	}
	public boolean withdrawl(Request objData)
	{
		if(objAccountHelper.withdrawl(objData)){
			CashDispenseChain cashDispense = new CashDispenseChain();
			return cashDispense.dispenseCash(objData.getAmount());
		}else{
			return false;
		}
		
		 //TODO:: code here which connects to db/service
	}
	public boolean undowithdrawl(Request objData)
	{
		return true;
		 //TODO:: code here which connects to db/service
	}
	
	public double checkBalanceAction(Request request){
		String accountId = request.getAccountId();
		return objAccountHelper.checkBalanace(accountId);
	}
	
	public boolean changePin(Request request){
		String accountId = request.getAccountId();
		String cardNo = request.getCardNo();
		int newPin = request.getPin();
		return cardImplementor.changePin(accountId, cardNo, newPin);
	}
	
	public boolean acceptPayment(Request request){
		String accountId = request.getAccountId();
		double topUpAmount = request.getAmount();
		return objAccountHelper.acceptPayment(accountId, topUpAmount);
	}
	
	public boolean payBill(Request request){
//		String accountId = request. 
		return false;
	}

}
