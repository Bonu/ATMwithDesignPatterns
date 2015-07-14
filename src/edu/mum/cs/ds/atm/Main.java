/**
 * 
 */
package edu.mum.cs.ds.atm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import edu.mum.cs.ds.atm.model.ATMMachine;
import edu.mum.cs.ds.atm.model.Account;
import edu.mum.cs.ds.atm.model.Card;
import edu.mum.cs.ds.atm.model.Request;

/**
 * @author janardhanbonu
 *
 */
public class Main {
	
	Account account1;
	
	public ATMMachine machine007=null;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Main main  = new Main();
		main.loadData();
		
	    System.out.println("Enter card number");
        Scanner input = new Scanner(System.in);
        String card = input.next();
        
        System.out.println("Enter Pin number");
        Scanner input1 = new Scanner(System.in);
        String pin = input1.next();
        
        Request request = new Request("withDraw", main.machine007.getId(),card,
        
	}

	public void loadData(){
		
		machine007 = new ATMMachine("Fairfield", "Fairfield-007");
		
		List<Card> cards = new ArrayList<Card>();
		Card card1 = new Card("1234567891234567","06/2090","Robert Bosch","MasterCard");
		card1.setPin(1234);
		cards.add(card1);
		
		Card card2 = new Card("5235852481237253","06/2080","Robert Bosch","Visa");
		cards.add(card2);
		
		account1 = new Account(2532124254L, "Robert Bossh", 50000, "Current");
		account1.addCard(card1);
		account1.addCard(card2);
		
		
		
		
		
	}
}
