package edu.mum.cs.ds.atm.command;

import edu.mum.cs.ds.atm.Reciever;
import edu.mum.cs.ds.atm.model.Request;


public class WithdrawCommand implements UndoCommand {

	private Request request;
	private Reciever objReciever;
	
	public WithdrawCommand(Request request, Reciever reciever){
		this.request=request;
		this.objReciever = reciever;
	}
	@Override
	public boolean execute() {
		return objReciever.withdrawl(request);
	}

	@Override
	public boolean undo() {
		 return objReciever.undowithdrawl(request);
	}

}
