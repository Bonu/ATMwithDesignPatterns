package edu.mum.cs.ds.atm.model;

public abstract class MachineState {
	
		protected double cashCapacity=500000; // TODO::Hardcoded for now.
		protected double cashAvailable;
	
	 	protected ATMMachine machine;
	 	protected double balance;
	 	public abstract void Deposit(double amount) throws Exception;
	    public abstract void Withdraw(double amount) throws Exception;
	    
}
