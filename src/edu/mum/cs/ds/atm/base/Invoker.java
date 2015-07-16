package edu.mum.cs.ds.atm.base;

import java.util.Stack;
import java.util.logging.Level;

import edu.mum.cs.ds.atm.command.Command;
import edu.mum.cs.ds.atm.command.UndoCommand;
import edu.mum.cs.ds.atm.model.Response;

public class Invoker {
	SingletonLogger  loggerWrapper = SingletonLogger.getInstance();
	SingletonLogger  SMSLoader = SingletonLogger.getInstance();
	Stack<Command> commands = new Stack<Command>();

<<<<<<< HEAD
	public void addAndExecute(Command command) {
		loggerWrapper.myLogger.log(Level.INFO, "This is the new message");
		
=======
	public Response addAndExecute(UndoCommand command) {
		loggerWrapper.myLogger.log(Level.INFO, "Added to stack and execute command");
>>>>>>> branch 'master' of https://github.com/Bonu/ATMwithDesignPatterns
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
