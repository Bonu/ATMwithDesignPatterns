package edu.mum.cs.ds.atm.command;

import edu.mum.cs.ds.atm.Reciever;
import edu.mum.cs.ds.atm.model.Request;
import edu.mum.cs.ds.atm.model.Response;

public class BillPayCommand implements UndoCommand {

	private Request request;
	private Reciever receiver;
	
	public BillPayCommand(Request request){
		this.request=request;
		receiver = new Reciever();
	}
	public Response execute() {
		return receiver.payBillAndDeductAmout(request);
	}

	public Response undo() {
		return new Response();
	}

}
