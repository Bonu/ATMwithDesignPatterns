package edu.mum.cs.ds.atm.command;

import edu.mum.cs.ds.atm.model.Request;


public class AcceptPaymentCommand implements UndoCommand {

	private Request request;
	
	public AcceptPaymentCommand(){
		this.request=request;
	}
	public boolean execute() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean undo() {
		// TODO Auto-generated method stub
		return false;
	}

}
