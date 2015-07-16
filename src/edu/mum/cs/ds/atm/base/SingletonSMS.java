package edu.mum.cs.ds.atm.base;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import edu.mum.cs.ds.atm.SMSFacade;
import edu.mum.cs.ds.atm.model.Response;

public class SingletonSMS {
	public static final Logger myLogger = Logger.getLogger("Test");
	private static SingletonSMS instance = null;

	public static SingletonSMS getInstance() {
		if (instance == null) {
			instance = new SingletonSMS();
		}
		return instance;
	}

	public static void sendSMS(Response response){
		String accountId = response.getRequest().getAccountId();
	}
	
	private static void prepareLogger() {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("MMddYYYYHHmm");
		String sDate = sdf.format(date);
		try {
			FileHandler myFileHandler = new FileHandler("myLogFile"+sDate+".log", true);
			myFileHandler.setFormatter(new SimpleFormatter());
			myLogger.addHandler(myFileHandler);
			myLogger.setUseParentHandlers(false);
			myLogger.setLevel(Level.ALL);
		} catch (Exception e) {
			// ...
		}
	}
	
	public void setMessage(String phoneNumber, String message){
		SMSFacade smsFacade = new SMSFacade(phoneNumber, message);
		smsFacade.sendSMS();
		
	}
	
}
