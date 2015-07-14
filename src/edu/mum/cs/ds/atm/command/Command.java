package edu.mum.cs.ds.atm.command;


public interface Command extends iTransaction {

	public boolean execute();

}
