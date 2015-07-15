package edu.mum.cs.ds.atm.command;

import edu.mum.cs.ds.atm.Reciever;
import edu.mum.cs.ds.atm.model.Request;


public class AcceptPaymentCommand implements UndoCommand {

	private Request request;
	private Reciever receiver;
	
	public AcceptPaymentCommand(Request request){
		this.request=request;
		receiver = new Reciever();
	}
	public boolean execute() {
		return receiver.acceptPayment(request);
	}

	public boolean undo() {
		// TODO Auto-generated method stub
		return false;
	}

}
