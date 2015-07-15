package edu.mum.cs.ds.atm.model;

public class PowerBill extends Bill {
	
	public double areaCode;
	
	public double meterNo;
	
	public PowerBill(double meterNo,double areacode,double amountToBePaid, String date,Account acc)
	{
		super(acc,amountToBePaid,date);
		this.areaCode = areacode;
		this.meterNo = meterNo;
		
	}
	  

}
