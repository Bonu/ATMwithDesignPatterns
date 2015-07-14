package edu.mum.cs.ds.atm.command;

import edu.mum.cs.ds.atm.model.Request;

public interface CommandTransaction {

	public boolean execute(Request request);
	public boolean undo(Request request);

}
