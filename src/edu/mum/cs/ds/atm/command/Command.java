package edu.mum.cs.ds.atm.command;

import edu.mum.cs.ds.atm.model.Request;

public interface Command extends Transaction {

	public boolean execute(Request request);

}
