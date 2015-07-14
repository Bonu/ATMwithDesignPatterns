package edu.mum.cs.ds.atm.model;

import java.io.Serializable;
import java.util.Date;

public class Log implements Serializable {

	Account account;
	Error error;
	ATMMachine mechine;
	Date date;
	public Log(Account account, Error error, ATMMachine mechine, Date date) {
		super();
		this.account = account;
		this.error = error;
		this.mechine = mechine;
		this.date = date;
	}
}
