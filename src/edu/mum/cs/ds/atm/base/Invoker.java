package edu.mum.cs.ds.atm.base;

import java.util.Stack;
import java.util.logging.Level;

import edu.mum.cs.ds.atm.command.Command;
import edu.mum.cs.ds.atm.command.UndoCommand;

public class Invoker {
	SingletonLogger  loggerWrapper = SingletonLogger.getInstance();
	
	
	Stack<Command> commands = new Stack<Command>();

	public void addAndExecute(Command command) {
		SingletonLogger.myLogger.log(Level.SEVERE, "Add execute invoked");
		commands.add(command);
		command.execute();
	}
	
	public void undo() {
		Command obj = commands.pop();
		if(obj instanceof UndoCommand)
			((UndoCommand)obj).undo();
	}

}
