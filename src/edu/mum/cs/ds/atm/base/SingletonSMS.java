package edu.mum.cs.ds.atm.base;

<<<<<<< HEAD
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class SingletonSMS {
	public static final Logger myLogger = Logger.getLogger("Test");
	private static SingletonSMS instance = null;

	public static SingletonSMS getInstance() {
		if (instance == null) {
			prepareLogger();
			instance = new SingletonSMS();
		}
		return instance;
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
	
	public void setMessage(String message){
		myLogger.info(message);
	}
=======
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
	
>>>>>>> branch 'master' of https://github.com/Bonu/ATMwithDesignPatterns
}
