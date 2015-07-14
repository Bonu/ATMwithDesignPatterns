package edu.mum.cs.ds.atm.model;

import java.io.Serializable;
import java.util.List;

public class Account implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1045564167693885884L;
	private int accountNumber;
	private String AccountHolderName;
	private double amount;
	private String accountType; // current or savings
	private List<Card> cards;
	
	public Account(int accountNumber, String accountHolderName, double amount,
			String accountType, List<Card> cards) {
		super();
		this.accountNumber = accountNumber;
		AccountHolderName = accountHolderName;
		this.amount = amount;
		this.accountType = accountType;
		this.cards = cards;
	}
	
	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public List<Card> getCards() {
		return cards;
	}

	public void setCards(List<Card> cards) {
		this.cards = cards;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public String getAccountHolderName() {
		return AccountHolderName;
	}

	public String getAccountType() {
		return accountType;
	}

	public Account(int accountNumber, String accountHolderName, double amount,
			String accountType) {
		super();
		this.accountNumber = accountNumber;
		AccountHolderName = accountHolderName;
		this.amount = amount;
		this.accountType = accountType;
	}
	
	
}
