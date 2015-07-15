package edu.mum.cs.ds.atm.model;

import java.io.Serializable;

import edu.mum.cs.ds.atm.model.state.MachineState;
import edu.mum.cs.ds.atm.model.state.NoCashState;

public class ATMMachine implements Serializable {
 
	public String location;
	public String Id;
	public String branchCode;
	private MachineState _machineState;
	private static ATMMachine instance;
	
	private ATMMachine()
	{
		_machineState = new NoCashState(this);
	}
	private ATMMachine(String location, String id, String branchCode) {
		super();
		this.location = location;
		Id = id;
		this.branchCode = branchCode;
		_machineState = new NoCashState(this);
	}
	public static ATMMachine getInstance(String location, String id, String branchCode) {
		//Singleton implementation, only one instance should exist at any point.
		if(instance == null)
		{
			return new ATMMachine(location, id, branchCode);
		}
		else
			return instance;
	}
	public void loadCash(double amount) throws Exception
	{
		_machineState.deposit(amount);
	}
	
	public void drawCash(double amount) throws Exception
	{
		_machineState.withdraw(amount);
	}
	
	public void setState(MachineState stateOfMachie)
	{
		this._machineState = stateOfMachie;
	}
	
	public MachineState getState()
	{
		return _machineState;
	}
	
	public String getLocation() {
		return location;
	}
	public String getId() {
		return Id;
	}
	public String getBranchCode() {
		return branchCode;
	}


 
}
