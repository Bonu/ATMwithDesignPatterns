package edu.mum.cs.ds.atm.model;

import java.io.Serializable;

public class Card implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3378698082789928290L;
	
	private long number;
	private int pin;
	private String validThrough;
	private String name;
	private String cardType; //visa or mastercard
	
	
	
	public Card(long number, String validThrough, String name, String cardType) {
		super();
		this.number = number;
		this.validThrough = validThrough;
		this.name = name;
		this.cardType = cardType;
	}
	public Card(long number, int pin, String validThrough, String name,
			String cardType) {
		super();
		this.number = number;
		this.pin = pin;
		this.validThrough = validThrough;
		this.name = name;
		this.cardType = cardType;
	}
	
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public long getNumber() {
		return number;
	}
	public String getValidThrough() {
		return validThrough;
	}
	public String getName() {
		return name;
	}
	public String getCardType() {
		return cardType;
	}
	@Override
	public String toString() {
		return "Card [number=" + number + ", pin=" + pin + ", validThrough="
				+ validThrough + ", name=" + name + ", cardType=" + cardType
				+ "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((cardType == null) ? 0 : cardType.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + (int) (number ^ (number >>> 32));
		result = prime * result + pin;
		result = prime * result
				+ ((validThrough == null) ? 0 : validThrough.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Card other = (Card) obj;
		if (cardType == null) {
			if (other.cardType != null)
				return false;
		} else if (!cardType.equals(other.cardType))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (number != other.number)
			return false;
		if (pin != other.pin)
			return false;
		if (validThrough == null) {
			if (other.validThrough != null)
				return false;
		} else if (!validThrough.equals(other.validThrough))
			return false;
		return true;
	}
	
	
	
}
