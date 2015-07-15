package edu.mum.cs.ds.atm.model;

import java.io.Serializable;

public class ATMMachine implements Serializable {
 
	public String location;
	public String Id;
	public String branchCode;
	private MachineState _machineState;
	
	public ATMMachine()
	{
		_machineState = new NoCashState(this);
	}
	public ATMMachine(String location, String id, String branchCode) {
		super();
		this.location = location;
		Id = id;
		this.branchCode = branchCode;
	}
	
	public void loadCash(double amount) throws Exception
	{
		_machineState.Deposit(amount);
	}
	
	public void drawCash(double amount) throws Exception
	{
		_machineState.Withdraw(amount);
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
