package edu.mum.cs.ds.atm.factory;

import java.util.HashMap;

import edu.mum.cs.ds.atm.command.AcceptPaymentCommand;
import edu.mum.cs.ds.atm.command.Command;
import edu.mum.cs.ds.atm.command.UndoCommand;
import edu.mum.cs.ds.atm.model.Request;

public class CommandFactory implements Factory {

	HashMap<String,Command> commands = new HashMap<String,Command>();
	
	public CommandFactory(Request request){
		commands.put("checkBalance", new AcceptPaymentCommand(request));
	}
	
	@Override
	public UndoCommand factoryMethod() {
		return (UndoCommand)commands.get("checkBalance");
	}

}
