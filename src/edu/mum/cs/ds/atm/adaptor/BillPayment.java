package edu.mum.cs.ds.atm.adaptor;

import edu.mum.cs.ds.atm.model.Bill;

public abstract class BillPayment {
	protected Bill bill;
	public BillPayment(Bill bill)
	{
		this.bill = bill;
	}
	abstract void pay() throws Exception;
}
