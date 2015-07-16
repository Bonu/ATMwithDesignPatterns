package edu.mum.cs.ds.atm;

import java.util.logging.Level;

import edu.mum.cs.ds.atm.base.Invoker;
import edu.mum.cs.ds.atm.base.SingletonLogger;
import edu.mum.cs.ds.atm.base.SingletonSMS;
import edu.mum.cs.ds.atm.command.AcceptPaymentCommand;
import edu.mum.cs.ds.atm.command.BillPayCommand;
import edu.mum.cs.ds.atm.command.ChangePinCommand;
import edu.mum.cs.ds.atm.command.CheckBalanceCommand;
import edu.mum.cs.ds.atm.command.UndoCommand;
import edu.mum.cs.ds.atm.command.WithdrawCommand;
import edu.mum.cs.ds.atm.factory.CommandFactory;
import edu.mum.cs.ds.atm.factory.Factory;
import edu.mum.cs.ds.atm.helper.CustomerImplementor;
import edu.mum.cs.ds.atm.model.ATMMachine;
import edu.mum.cs.ds.atm.model.Account;
import edu.mum.cs.ds.atm.model.Card;
import edu.mum.cs.ds.atm.model.Request;
import edu.mum.cs.ds.atm.model.Response;

/**
 * @author janardhanbonu
 */
public class RequestHandlerFacade {
	
	Account account1;
	
	public ATMMachine machine007=null;
	SingletonLogger  loggerWrapper = SingletonLogger.getInstance();
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		RequestHandlerFacade main  = new RequestHandlerFacade();
		main.loadData();
		Invoker invoker = new Invoker();
        Response response = new Response();
        
		SingletonLogger.myLogger.log(Level.SEVERE, "Add execute invoked");
//	    System.out.println("Enter card number");
//        Scanner input = new Scanner(System.in);
//        String card = input.next();
//        
//        System.out.println("Enter Pin number");
//        Scanner input1 = new Scanner(System.in);
//        String pin = input1.next();
//      
		/*
		checkBalance
		withDraw
		changePin
		acceptPayment
		billPay
		*/
		String card = "111111111";
        Request withDrawRequest = new Request("withDraw", main.machine007.getId(),card,main.machine007.branchCode,2000.00,"111111111");
        Factory factory = new CommandFactory();
        UndoCommand uc = factory.factoryMethod(withDrawRequest);
        response = invoker.addAndExecute(uc);
        SingletonLogger.myLogger.log(Level.INFO, response.toString());
        SingletonSMS smssender = SingletonSMS.getInstance();
        CustomerImplementor  customerImplementor = new CustomerImplementor();
        smssender.setMessage(customerImplementor.getCustomerPhone(response.getRequest().getAccountId()), response.getMessage());
        
        Request chechBalanceRequest = new Request("checkBalance", main.machine007.getId(),card,main.machine007.branchCode,2000.00,"111111111");
        uc = factory.factoryMethod(chechBalanceRequest);
        response = invoker.addAndExecute(uc);
        SingletonLogger.myLogger.log(Level.INFO, response.toString());
        smssender.setMessage(customerImplementor.getCustomerPhone(response.getRequest().getAccountId()), response.getMessage());

        
        
	}
	
	
	public void handleRequest(Request request){
		
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
		SingletonLogger.myLogger.log(Level.SEVERE, "Add execute invoked");
		machine007 = ATMMachine.getInstance("Fairfield", "IOWA-FAIRFIELD-007","IOWA-FAIRLFILED-007-SQUARE");
		Card card1 = new Card("1111111111234567","06/2090","Robert Bosch","MasterCard","1111111111");
		card1.setPin(1234);
		Card card2 = new Card("1111111111237253","06/2080","Robert Bosch","Visa","111111111");
		card2.setPin(3241);

		account1 = new Account("customer1","2532124254", "Robert Bossh", 50000, "Current");
		account1.addCard(card1);
		account1.addCard(card2);

	}
}
