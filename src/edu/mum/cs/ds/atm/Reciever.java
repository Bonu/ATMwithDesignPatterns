package edu.mum.cs.ds.atm;

import edu.mum.cs.ds.atm.helper.AccountImplementor;
import edu.mum.cs.ds.atm.model.Account;
import edu.mum.cs.ds.atm.model.Request;

public class Reciever {
	
	private AccountImplementor objAccountHelper = new AccountImplementor();
	
	public Account loadAccount(Request objData)
	{
		return objAccountHelper.loadAccount(objData);
	}
	public boolean withdrawl(Request objData)
	{
		return objAccountHelper.withdrawl(objData);
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

}
