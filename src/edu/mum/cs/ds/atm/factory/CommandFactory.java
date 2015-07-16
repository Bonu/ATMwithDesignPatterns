package edu.mum.cs.ds.atm.factory;

import java.util.HashMap;

import edu.mum.cs.ds.atm.command.AcceptPaymentCommand;
import edu.mum.cs.ds.atm.command.BillPayCommand;
import edu.mum.cs.ds.atm.command.ChangePinCommand;
import edu.mum.cs.ds.atm.command.CheckBalanceCommand;
import edu.mum.cs.ds.atm.command.Command;
import edu.mum.cs.ds.atm.command.UndoCommand;
import edu.mum.cs.ds.atm.command.WithdrawCommand;
import edu.mum.cs.ds.atm.model.Request;

public class CommandFactory implements Factory {

	private HashMap<String,Command> commands = new HashMap<String,Command>();
	private Request request;
	
	public CommandFactory(Request request){
		this.request=request;
		commands.put("checkBalance", new CheckBalanceCommand(request));
		commands.put("withdraw", new WithdrawCommand(request));
		commands.put("changePin", new ChangePinCommand(request));
		commands.put("acceptPayment", new AcceptPaymentCommand(request));
		commands.put("billPay", new BillPayCommand(request));
	}
	
	@Override
	public UndoCommand factoryMethod() {
		return (UndoCommand)commands.get(request.getActionType());
	}

}
