package edu.mum.cs.ds.atm;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class SMSFacade {

	private String phoneNumber;
	private String message;

	public SMSFacade(String phoneNumber, String message) {
		this.phoneNumber = phoneNumber;
		this.message = message;
	}

	public boolean sendSMS() {
		BufferedWriter writer = null;
		try {
			File logFile = new File(phoneNumber+"SMS.txt");
			System.out.println(logFile.getCanonicalPath());
			writer = new BufferedWriter(new FileWriter(logFile));
			writer.write(message);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				// Close the writer regardless of what happens...
				writer.close();
			} catch (Exception e) {
			}
		}
		return true;
	}

}