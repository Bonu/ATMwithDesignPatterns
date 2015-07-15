package edu.mum.cs.ds.atm.model;

import java.io.Serializable;

public class Log implements Serializable {

	long accountNumber;
	String errorCode;
	String parent;
	String mechineId;
	String date;
	
	
	public Log(Account account, String errorCode, String parent,
			String mechine, String date) {
		super();
		this.accountNumber = account.getAccountNumber();
		this.errorCode = errorCode;
		this.parent = parent;
		this.mechineId = mechine;
		this.date = date;
	}


	public void systemlog(){
		System.out.println(accountNumber+" "+parent+" "+errorCode+" "+mechineId+" "+date);
	}
}
