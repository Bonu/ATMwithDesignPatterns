package edu.mum.cs.ds.atm.command;

import edu.mum.cs.ds.atm.Reciever;
import edu.mum.cs.ds.atm.model.Request;
import edu.mum.cs.ds.atm.model.Response;


public class ChangePinCommand implements UndoCommand {

	private Request  request;
	private Reciever receiver;
	
	public ChangePinCommand(Request request){
		this.request = request;
		receiver = new Reciever();
	}
	public Response execute() {
		return receiver.changePin(request);
	}

	public Response undo() {
		return new Response();
	}

}
