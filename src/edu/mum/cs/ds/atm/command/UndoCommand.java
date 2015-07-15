package edu.mum.cs.ds.atm.command;

import edu.mum.cs.ds.atm.model.Response;


public interface UndoCommand extends Command {
	public Response undo();
}
