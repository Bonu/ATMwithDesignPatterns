package edu.mum.cs.ds.atm.helper;

import java.util.HashMap;

import edu.mum.cs.ds.atm.model.Bill;
import edu.mum.cs.ds.atm.model.PowerBill;

public class BillPayImplementor {
	
	public BillPayImplementor() {
		
	}
	
	public boolean payBill(String accountId, String billId){
		BillsTable bt = new BillsTable();
		Bill bill = bt.getBill(billId);
		AccountImplementor accountImplementor = new AccountImplementor();
		accountImplementor.withdraw(accountId,bill.getPaymentAmount());
		return true;
	}
	
}


class BillsTable {

	HashMap<String,Bill> bills = new HashMap<String,Bill>();
	public BillsTable(){
		this.loadData();
	}
	public Bill getBill(String billNo){
		 return bills.get(billNo);
	}
	public void loadData(){
		bills.put("PBILL11111", new PowerBill("meter11111","AR7-1111",2000.00,"11/11/2015","PBILL11111"));
		bills.put("PBILL22222", new PowerBill("meter22222","AR7-2222",2500.00,"11/12/2015","PBILL22222"));
	}
	
}



