package edu.mum.cs.ds.atm.base;

import java.util.Stack;
import java.util.logging.Level;

import edu.mum.cs.ds.atm.command.Command;
import edu.mum.cs.ds.atm.command.UndoCommand;

public class Invoker {
	SingletonLogger  loggerWrapper = SingletonLogger.getInstance();
	SingletonLogger  SMSLoader = SingletonLogger.getInstance();
	Stack<Command> commands = new Stack<Command>();

	public void addAndExecute(Command command) {
		loggerWrapper.myLogger.log(Level.INFO, "This is the new message");
		
		commands.add(command);
		command.execute();
	}
	
	public void undo() {
		Command obj = commands.pop();
		if(obj instanceof UndoCommand)
			((UndoCommand)obj).undo();
	}

}
