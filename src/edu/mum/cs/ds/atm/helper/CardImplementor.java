package edu.mum.cs.ds.atm.helper;

import java.util.HashMap;

import edu.mum.cs.ds.atm.model.Card;

public class CardImplementor {
	
	public CardImplementor() {
		
	}
	
	public boolean changePin(String accountId, String cardNo, int pin){
		CardsTable ct = new CardsTable();
		Card card = ct.getCard(cardNo);
		card.setPin(pin);
		return true;
	}
	
}


class CardsTable {
	
	HashMap<String,Card> cards = new HashMap<String,Card>();
	
	public CardsTable(){
		this.loadData();
	}
	
	public Card getCard(String cardNo){
		 return cards.get(cardNo);
	}
	
	public void loadData(){
		cards.put("111111111123456", new Card("111111111123456","08/2090","Major Robert","Visa","111111111"));
		cards.put("222222222123456", new Card("222222222123456","08/2090","Major Robert","Visa","222222222"));
		cards.put("333333333123456", new Card("333333333123456","08/2090","Major Robert","Visa","333333333"));
		cards.put("444444444123456", new Card("444444444123456","08/2090","Major Robert","Visa","444444444"));
		cards.put("555555555123456", new Card("555555555123456","08/2090","Major Robert","Visa","555555555"));
		cards.put("666666666123456", new Card("666666666123456","08/2090","Major Robert","Visa","666666666"));
		cards.put("777777777123456", new Card("777777777123456","08/2090","Major Robert","Visa","777777777"));
		cards.put("888888888123456", new Card("888888888123456","08/2090","Major Robert","Visa","888888888"));
		cards.put("999999999123456", new Card("999999999123456","08/2090","Major Robert","Visa","999999999"));
		cards.put("111111112123456", new Card("111111112123456","08/2090","Major Robert","Visa","111111112"));
	}
	
}



