package edu.mum.cs.ds.atm.command;

import edu.mum.cs.ds.atm.Reciever;
import edu.mum.cs.ds.atm.model.Request;


public class WithdrawCommand implements UndoCommand {

	private Request request;
	private Reciever receiver;
	public WithdrawCommand(Request request){
		this.request=request;
		receiver = new Reciever();
	}
	@Override
	public boolean execute() {
		return receiver.withdrawl(request);
	}

	@Override
	public boolean undo() {
		 return receiver.undowithdrawl(request);
	}

}
