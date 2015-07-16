package edu.mum.cs.ds.atm.command;

import edu.mum.cs.ds.atm.model.Response;


public interface Command extends iTransaction {

	public Response execute();

}
