package edu.mum.cs.ds.atm.command;

import edu.mum.cs.ds.atm.Reciever;
import edu.mum.cs.ds.atm.model.Request;


public class WithdrawCommand implements UndoCommand {

	private Request request;
	private Reciever objReciever = new Reciever();
	
	public WithdrawCommand(Request request){
		this.request=request; 
	}
	public boolean execute() {
		return objReciever.withdrawl(request);
	}

	public boolean undo() {
		 return objReciever.undowithdrawl(request);
	}

}
