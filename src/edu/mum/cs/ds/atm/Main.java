package edu.mum.cs.ds.atm;

import edu.mum.cs.ds.atm.base.Invoker;
import edu.mum.cs.ds.atm.command.CheckBalanceCommand;
import edu.mum.cs.ds.atm.command.WithdrawCommand;
import edu.mum.cs.ds.atm.model.ATMMachine;
import edu.mum.cs.ds.atm.model.Account;
import edu.mum.cs.ds.atm.model.Card;
import edu.mum.cs.ds.atm.model.Request;

/**
 * @author janardhanbonu
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
		
//	    System.out.println("Enter card number");
//        Scanner input = new Scanner(System.in);
//        String card = input.next();
//        
//        System.out.println("Enter Pin number");
//        Scanner input1 = new Scanner(System.in);
//        String pin = input1.next();
//      
		String card = "111111111";
        Request withDrawRequest = new Request("withDraw", main.machine007.getId(),card,main.machine007.branchCode,2000.00,"111111111");
        WithdrawCommand withdrawCommand = new WithdrawCommand(withDrawRequest);
        Invoker invoker = new Invoker();
        invoker.addAndExecute(withdrawCommand);
        
        Request chechBalanceRequest = new Request("checkBalance", main.machine007.getId(),card,main.machine007.branchCode,2000.00,"111111111");
        CheckBalanceCommand checkBalanceCommand = new CheckBalanceCommand(chechBalanceRequest);
        invoker.addAndExecute(checkBalanceCommand);
        
	}
	
	public void preLoadATM(){
		ATMMachine atmMachine = ATMMachine.getInstance("location", "Fairfield-Argiro-007", "Fairfield-square");
		try {
			atmMachine.loadCash(10000000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void loadData(){
		
		machine007 = ATMMachine.getInstance("Fairfield", "IOWA-FAIRFIELD-007","IOWA-FAIRLFILED-007-SQUARE");
		Card card1 = new Card("1111111111234567","06/2090","Robert Bosch","MasterCard","1111111111");
		card1.setPin(1234);
		Card card2 = new Card("1111111111237253","06/2080","Robert Bosch","Visa","111111111");
		card2.setPin(3241);

		account1 = new Account("2532124254", "Robert Bossh", 50000, "Current");
		account1.addCard(card1);
		account1.addCard(card2);
		
		
	}
}
