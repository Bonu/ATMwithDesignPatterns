package edu.mum.cs.ds.atm.model;

import java.io.Serializable;

public class ATMMachine implements Serializable {
	private String location;
	private String Id;
	
	private MachineState _machineState;
	
	public ATMMachine()
	{
		_machineState = new NoCashState();
	}
	public void setState(MachineState stateOfMachie)
	{
		this._machineState = stateOfMachie;
	}
	
	public MachineState getState()
	{
		return _machineState;
	}
}
