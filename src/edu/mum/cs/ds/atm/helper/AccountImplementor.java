package edu.mum.cs.ds.atm.helper;

import java.util.HashMap;

import edu.mum.cs.ds.atm.model.Account;
import edu.mum.cs.ds.atm.model.Card;
import edu.mum.cs.ds.atm.model.Request;

public class AccountImplementor {
	
	public AccountImplementor() {
		
	}
	
	public Account loadAccount(Request objData) {
		return new Account("",null,0,null);
	}
	
	public boolean update(Request objData) {
		return true;
	}

	public boolean withdrawl(Request objData) {
		return true;
	}
	
	public double checkBalanace(String accountId){
		AccountsTable adb = new AccountsTable();
		Account account = adb.getAccount(accountId);
		System.out.println(account.toString());
		return account.getAmount();
	}
	
	public boolean acceptPayment(String accountId, double topUpAmount){
		AccountsTable adb = new AccountsTable();
		Account account = adb.getAccount(accountId);
		double existingAmount = account.getAmount();
		account.setAmount(existingAmount + topUpAmount);
		return true;
	}
	
}


class AccountsTable {
	
	HashMap<String,Account> accounts = new HashMap<String,Account>();
	
	HashMap<String,Card> cards = new HashMap<String,Card>();
	
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
		
		cards.put("1111111123456", new Card("1111111123456","08/2090","Major Robert","Visa","111111111"));
		cards.put("222222222123456", new Card("222222222123456","08/2090","Major Robert","Visa","222222222"));
		cards.put("333333333123456", new Card("333333333123456","08/2090","Major Robert","Visa","333333333"));
		cards.put("444444444123456", new Card("444444444123456","08/2090","Major Robert","Visa","444444444"));
		cards.put("555555555123456", new Card("555555555123456","08/2090","Major Robert","Visa","555555555"));
		cards.put("666666666123456", new Card("666666666123456","08/2090","Major Robert","Visa","666666666"));
		cards.put("777777777123456", new Card("777777777123456","08/2090","Major Robert","Visa","777777777"));
		cards.put("888888888123456", new Card("888888888123456","08/2090","Major Robert","Visa","888888888"));
		cards.put("999999999123456", new Card("999999999123456","08/2090","Major Robert","Visa","999999999"));
		cards.put("111111112123456", new Card("111111112123456","08/2090","Major Robert","Visa","111111112"));
		
	}
	
}




