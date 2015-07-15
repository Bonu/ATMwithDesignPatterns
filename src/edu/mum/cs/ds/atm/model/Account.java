package edu.mum.cs.ds.atm.model;

import java.io.Serializable;
import java.util.List;

public class Account implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1045564167693885884L;
	private long accountNumber;
	private String AccountHolderName;
	private double amount;
	private String accountType; // current or savings
	private List<Card> cards;
	
	public Account(long accountNumber, String accountHolderName, double amount,
			String accountType, List<Card> cards) {
		super();
		this.accountNumber = accountNumber;
		AccountHolderName = accountHolderName;
		this.amount = amount;
		this.accountType = accountType;
		this.cards = cards;
	}
	
	public Account(long accountNumber, String accountHolderName, double amount,
			String accountType) {
		super();
		this.accountNumber = accountNumber;
		AccountHolderName = accountHolderName;
		this.amount = amount;
		this.accountType = accountType;
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

	public long getAccountNumber() {
		return accountNumber;
	}

	public String getAccountHolderName() {
		return AccountHolderName;
	}

	public String getAccountType() {
		return accountType;
	}

	public void addCard(Card card){
		cards.add(card);
	}
	
	
}
