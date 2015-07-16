package edu.mum.cs.ds.atm.model;

public class PowerBill extends Bill {
	
	public String areaCode;
	
	public String meterNo;
	
	public PowerBill(String meterNo,String areacode,double amountToBePaid, String date,Account acc, String billNo)
	{
		super(acc,amountToBePaid,date,billNo);
		this.areaCode = areacode;
		this.meterNo = meterNo;
	}
	
	public PowerBill(String meterNo,String areacode,double amountToBePaid, String date, String billNo)
	{
		super(null,amountToBePaid,date,billNo);
		this.areaCode = areacode;
		this.meterNo = meterNo;
	}


}
