package edu.mum.cs.ds.atm.base;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class SingletonLogger {
	public static final Logger myLogger = Logger.getLogger("Test");
	private static SingletonLogger instance = null;

	public static SingletonLogger getInstance() {
		if (instance == null) {
			prepareLogger();
			instance = new SingletonLogger();
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
}
