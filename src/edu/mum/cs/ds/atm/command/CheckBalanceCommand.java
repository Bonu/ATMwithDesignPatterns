package edu.mum.cs.ds.atm.command;

import edu.mum.cs.ds.atm.Reciever;
import edu.mum.cs.ds.atm.model.Request;
import edu.mum.cs.ds.atm.model.Response;

public class CheckBalanceCommand implements UndoCommand {

	private Request  request;
	private Reciever receiver;
	
	public CheckBalanceCommand() {
		receiver = new Reciever();
	}
	public CheckBalanceCommand(Request request) {
		this.request = request;
		receiver = new Reciever();
	}
	
	public Response execute() {
		return receiver.checkBalanceAction(request);
	}
	
	@Override
	public Response undo() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
