package edu.mum.cs.ds.atm.base;

import java.util.Stack;

import edu.mum.cs.ds.atm.command.Command;

public class Invoker {

	Stack<Command> commands = new Stack<Command>();

	public void addRequestToQueue(Command command) {
		commands.add(command);
		command.execute();
	}

}
