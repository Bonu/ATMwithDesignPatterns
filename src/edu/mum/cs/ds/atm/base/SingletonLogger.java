package edu.mum.cs.ds.atm.base;

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
		try {
			FileHandler myFileHandler = new FileHandler("/logfiel/myLogFile.log", true);
			myFileHandler.setFormatter(new SimpleFormatter());
			myLogger.addHandler(myFileHandler);
			myLogger.setUseParentHandlers(false);
			myLogger.setLevel(Level.ALL);
		} catch (Exception e) {
			// ...
		}
	}
}
