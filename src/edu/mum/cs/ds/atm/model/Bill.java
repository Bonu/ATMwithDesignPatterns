package edu.mum.cs.ds.atm.model;

import java.io.Serializable;
import java.util.Date;

public class Bill implements Serializable {
	Account account;
	Payment billPayment;
	Date date;

}
