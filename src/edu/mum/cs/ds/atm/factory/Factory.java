package edu.mum.cs.ds.atm.factory;

import edu.mum.cs.ds.atm.command.UndoCommand;
import edu.mum.cs.ds.atm.model.Request;

public interface Factory {
	public UndoCommand factoryMethod(Request request);
}
