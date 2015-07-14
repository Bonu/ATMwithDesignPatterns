package edu.mum.cs.ds.atm.command;

import edu.mum.cs.ds.atm.model.Request;

public class CheckBalanceCommand implements Command {

	private Request  request;
	
	public CheckBalanceCommand(Request request){
		this.request = request;
	}
	@Override
	public boolean execute() {

		
		return false;
	}
}
