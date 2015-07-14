package edu.mum.cs.ds.atm;

import edu.mum.cs.ds.atm.model.ATMMachine;
import edu.mum.cs.ds.atm.model.Account;

public class Testwithdrawlworkflow {
	
	/*
	 * 1. Check the state of the ATM Machine, if it is NotEnoughCash state we should not proceed.
	 * 2. Check the state of the account, if it is red we should not proceed
	 * 3. Issue withdrawl command
	 * 4. Send SMS to user Mobile
	 * 5. Log the transaction for future audit
	 * 6. Print Reciept
	*/

	public void beginWorkFlow()
	{
		
		ATMMachine objMachine = new ATMMachine();
	
		Account objAccount = loadAccountInfo();
	
		
		
	
	
	}
	
	public Account loadAccountInfo()
	{
		return new Account(0,null,0,null);
	}
}
