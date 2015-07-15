package edu.mum.cs.ds.atm.model;

import java.util.Date;

public class UtilityPayment {

	Bill utilityBill = new Bill(new Account("111111111", "Mahabub", 210.0, "S"),
			150.0, "06/13/2015", "CBN642382");
	Log utilLog = new Log(new Account("111111111", "Mahabub", 210.0, "S"), "654ST",
			"111", "325ATC", "06/13/2015");

	// Log(Account account, String errorCode, String parent,
	// String mechine, String date)
	// boolean paymentStatus = utilityBill.payBill();
	public void payBill() {
		if (!utilityBill.payBill())
			System.out.println("Transaction rejected due to insufficient balance");
	}

}
