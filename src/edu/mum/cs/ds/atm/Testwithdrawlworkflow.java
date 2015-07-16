package edu.mum.cs.ds.atm;

import edu.mum.cs.ds.atm.base.Invoker;
import edu.mum.cs.ds.atm.command.WithdrawCommand;
import edu.mum.cs.ds.atm.model.ATMMachine;
import edu.mum.cs.ds.atm.model.Account;
import edu.mum.cs.ds.atm.model.Request;

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
		
		ATMMachine objMachine = ATMMachine.getInstance(null,null,null); 
		Request objRequest = new Request(null, null, null, null,"");
		WithdrawCommand objCommand = new WithdrawCommand(objRequest);
		Invoker objInvoker = new Invoker();
		objInvoker.addAndExecute(objCommand);

		//Add these commands to the invoker
		
	}
	
	public Account loadAccountInfo()
	{
		return new Account("","",null,0,null);
	}
}

