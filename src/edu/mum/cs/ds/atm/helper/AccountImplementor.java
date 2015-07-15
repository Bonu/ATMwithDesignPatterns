package edu.mum.cs.ds.atm.helper;

import java.util.HashMap;

import edu.mum.cs.ds.atm.model.Account;
import edu.mum.cs.ds.atm.model.Card;
import edu.mum.cs.ds.atm.model.Request;

public class AccountImplementor {
	
	
	public AccountImplementor()
	{
		
	}
	public Account loadAccount(Request objData)
	{
		return new Account("",null,0,null);
	}
	public boolean update(Request objData)
	{
		return true;
	}

	public boolean withdrawl(Request objData)
	{
		return true;
	}
	
	public double checkBalanace(String accountId){
		AccountsTable adb = new AccountsTable();
		Account account = adb.getAccount(accountId);
		System.out.println(account.toString());
		return account.getAmount();
	}
	
	
}


class AccountsTable {
	
	HashMap<String,Account>  accounts = new HashMap<String,Account>();
	
	public AccountsTable(){
		this.loadData();
	}
	
	public Account getAccount(String accountId){
		 return accounts.get(accountId);
	}
	
	public void loadData(){
		Account account = new Account("123456789","AccountHolderName1",11000.00,"Saving");
		account.addCard(new Card("1111111123456","08/2090","Major Robert","Visa","111111111"));
		accounts.put("111111111", account);
		
		accounts.put("222222222", new Account("222222222","AccountHolderName2",22000.00,"Saving"));
		accounts.put("333333333", new Account("333333333","AccountHolderName3",33000.00,"Saving"));
		accounts.put("444444444", new Account("444444444","AccountHolderName4",44000.00,"Saving"));
		accounts.put("555555555", new Account("555555555","AccountHolderName5",55000.00,"Saving"));
		accounts.put("666666666", new Account("666666666","AccountHolderName6",66000.00,"Saving"));
		accounts.put("777777777", new Account("777777777","AccountHolderName7",66000.00,"Saving"));
		accounts.put("888888888", new Account("888888888","AccountHolderName8",66000.00,"Saving"));
		accounts.put("999999999", new Account("999999999","AccountHolderName9",66000.00,"Saving"));
		accounts.put("111111112", new Account("111111112","AccountHolderName12",66000.00,"Current"));
	}
	
}




