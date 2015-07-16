package edu.mum.cs.ds.atm.factory;

import edu.mum.cs.ds.atm.command.UndoCommand;

public interface Factory {
	public UndoCommand factoryMethod();
}
