package edu.mum.cs.ds.atm.base;

import java.util.Stack;

import edu.mum.cs.ds.atm.command.Command;
import edu.mum.cs.ds.atm.command.UndoCommand;

public class Invoker {

	Stack<Command> commands = new Stack<Command>();

	public void addAndExecute(Command command) {
		commands.add(command);
		command.execute();
	}
	
	public void undo()
	{
		Command obj = commands.pop();
		if(obj instanceof UndoCommand)
			((UndoCommand)obj).undo();
	}

}
