package edu.mum.cs.ds.atm.command;

import edu.mum.cs.ds.atm.model.Request;

public interface UndoCommand extends Command {
	public boolean undo(Request request);
}
