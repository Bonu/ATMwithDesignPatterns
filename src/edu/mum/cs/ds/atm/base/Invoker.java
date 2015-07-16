package edu.mum.cs.ds.atm.base;

import java.util.Stack;
import java.util.logging.Level;

import edu.mum.cs.ds.atm.command.Command;
import edu.mum.cs.ds.atm.command.UndoCommand;
import edu.mum.cs.ds.atm.model.Response;

public class Invoker {
	SingletonLogger  loggerWrapper = SingletonLogger.getInstance();
	Stack<Command> commands = new Stack<Command>();

	public Response addAndExecute(UndoCommand command) {
		loggerWrapper.myLogger.log(Level.INFO, "Added to stack and execute command");
		commands.add(command);
		return command.execute();
	}
	
	public Response undo() {
		Command obj = commands.pop();
		Response response=null;
		if(obj instanceof UndoCommand){
			response =  ((UndoCommand) obj).undo();
		}
		return response;
	}

}
