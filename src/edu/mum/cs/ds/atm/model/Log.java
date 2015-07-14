package edu.mum.cs.ds.atm.model;

import java.io.Serializable;
import java.util.Date;

public class Log implements Serializable {

	Account account;
	Error error;
	ATMMachine mechine;
	Date date;
}
