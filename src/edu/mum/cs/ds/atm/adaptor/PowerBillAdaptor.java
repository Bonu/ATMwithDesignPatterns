package edu.mum.cs.ds.atm.adaptor;

import edu.mum.cs.ds.atm.model.PowerBill;
import edu.mum.cs.ds.atm.model.PowerVendorFacade;


public class PowerBillAdaptor extends BillPayment {

	private String areaCode; 
	public PowerBillAdaptor(PowerBill powerbill)
	{
		super(powerbill);
	}
	
	@Override
	void pay() throws Exception {
		//Talk to facade power vendor facade here and make the payment
		if(this.bill.account.getAmount() - this.bill.paymentAmount < 0)
			throw new Exception("Insufficient funds");
		else {
			PowerBill obj = (PowerBill)this.bill;
			PowerVendorFacade.acceptPayment(obj.meterNo, obj.areaCode, obj.date,obj.paymentAmount, obj.account.getAccountNumber());
		}
	}

}
