package edu.mum.cs.ds.atm.command;

import edu.mum.cs.ds.atm.Reciever;
import edu.mum.cs.ds.atm.model.Request;

public class BillPayCommand implements UndoCommand {

	private Request request;
	private Reciever receiver;
	
	public BillPayCommand(Request request){
		this.request=request;
		receiver = new Reciever();
	}
	public boolean execute() {
		return receiver.payBill(request);
	}

	public boolean undo() {
		// TODO Auto-generated method stub
		return false;
	}

}
