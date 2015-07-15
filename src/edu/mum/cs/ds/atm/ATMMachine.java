package edu.mum.cs.ds.atm;

import java.io.Serializable;

import edu.mum.cs.ds.atm.model.state.MachineState;
import edu.mum.cs.ds.atm.model.state.NoCashState;

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
