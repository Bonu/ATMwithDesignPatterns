package edu.mum.cs.ds.atm.command;

import edu.mum.cs.ds.atm.Reciever;
import edu.mum.cs.ds.atm.model.Request;

public class CheckBalanceCommand implements Command {

	private Request  request;
	private Reciever receiver;
	
	public CheckBalanceCommand(Request request){
		this.request = request;
		receiver = new Reciever();
	}
	
	public boolean execute() {
		receiver.checkBalanceAction(request);
		return false;
	}
	
	
}
