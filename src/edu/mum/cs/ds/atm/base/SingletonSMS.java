package edu.mum.cs.ds.atm.base;
import java.util.logging.Logger;

import edu.mum.cs.ds.atm.SMSFacade;

public class SingletonSMS {
	public static final Logger myLogger = Logger.getLogger("Test");
	private static SingletonSMS instance = null;

	public static SingletonSMS getInstance() {
		if (instance == null) {
			instance = new SingletonSMS();
		}
		return instance;
	}
	
	public void setMessage(String phoneNumber, String message){
		SMSFacade smsFacade = new SMSFacade(phoneNumber, message);
		smsFacade.sendSMS();
		
	}
	
}
