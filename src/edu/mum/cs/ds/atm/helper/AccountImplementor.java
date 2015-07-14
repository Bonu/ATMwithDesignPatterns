package edu.mum.cs.ds.atm.helper;

import edu.mum.cs.ds.atm.model.Account;
import edu.mum.cs.ds.atm.model.Request;

public class AccountImplementor {
	
	public AccountImplementor()
	{
		
	}
	public Account loadAccount(Request objData)
	{
		return new Account(0,null,0,null);
	}
	public boolean update(Request objData)
	{
		return true;
	}

	public boolean withdrawl(Request objData)
	{
		return true;
	}
}
