package edu.mum.cs.ds.atm.command;

import edu.mum.cs.ds.atm.Reciever;
import edu.mum.cs.ds.atm.model.Request;
import edu.mum.cs.ds.atm.model.Response;


public class WithdrawCommand implements UndoCommand {

	private Request request;
	private Reciever receiver;
	
	public WithdrawCommand(Request request){
		this.request=request;
		receiver = new Reciever();
	}
	
	public Response execute() {
		return receiver.withdrawl(request);
	}

	public Response undo() {
		 return receiver.undowithdrawl(request);
	}

}
