package edu.mum.cs.ds.atm.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Account implements Serializable {

	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", AccountHolderName=" + AccountHolderName + ", amount="
				+ amount + ", accountType=" + accountType + ", cards=" + cards + "]";
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = -1045564167693885884L;
	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	private String accountNumber;
	private String AccountHolderName;
	private double amount;
	private String accountType; // current or savings
	private String customerId;
	private List<Card> cards = new ArrayList<Card>();
	
	public Account(String customerId, String accountNumber, String accountHolderName, double amount,
			String accountType, List<Card> cards) {
		super();
		this.customerId=customerId;
		this.accountNumber = accountNumber;
		this.AccountHolderName = accountHolderName;
		this.amount = amount;
		this.accountType = accountType;
		this.cards = cards;
	}
	
	public Account(String customerId, String accountNumber, String accountHolderName, double amount,
			String accountType) {
		super();
		this.customerId=customerId;
		this.accountNumber = accountNumber;
		this.AccountHolderName = accountHolderName;
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

	public String getAccountNumber() {
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
