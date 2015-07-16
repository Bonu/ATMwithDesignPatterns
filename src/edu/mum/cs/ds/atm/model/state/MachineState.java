package edu.mum.cs.ds.atm.model.state;

import edu.mum.cs.ds.atm.model.ATMMachine;


public abstract class MachineState {
	
		protected double cashCapacity=500000; // TODO::Hardcoded for now.
		protected double cashAvailable;
	
	 	protected ATMMachine machine;
	 	protected double balance;
	 	public abstract void deposit(double amount) throws Exception;
	    public abstract void withdraw(double amount) throws Exception;
	    
}
