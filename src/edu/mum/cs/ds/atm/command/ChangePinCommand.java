package edu.mum.cs.ds.atm.command;

import edu.mum.cs.ds.atm.model.Request;


public class ChangePinCommand implements UndoCommand {

	private Request request;
	
	public ChangePinCommand(){
		this.request=request;
	}
	@Override
	public boolean execute() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean undo() {
		// TODO Auto-generated method stub
		return false;
	}

}
