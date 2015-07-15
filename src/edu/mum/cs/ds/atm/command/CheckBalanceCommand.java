package edu.mum.cs.ds.atm.command;

import edu.mum.cs.ds.atm.Reciever;
import edu.mum.cs.ds.atm.model.Request;
import edu.mum.cs.ds.atm.model.Response;

public class CheckBalanceCommand implements Command {

	private Request  request;
	private Reciever receiver;
	
	public CheckBalanceCommand(Request request){
		this.request = request;
		receiver = new Reciever();
	}
	
	public Response execute() {
		return receiver.checkBalanceAction(request);
	}
	
	
}
