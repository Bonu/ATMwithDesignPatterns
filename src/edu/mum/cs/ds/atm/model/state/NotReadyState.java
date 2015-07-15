package edu.mum.cs.ds.atm.model.state;

import edu.mum.cs.ds.atm.model.ATMMachine;


public class NotReadyState extends MachineState {

	public NotReadyState(ATMMachine machine){
		this.machine = machine;
	}
	public NotReadyState(MachineState state)
	{
		this.cashAvailable = state.cashAvailable;
	}
	public void reloadMachineState()
	{
		MachineState currentMachineState;
		if(this.cashAvailable == 0)
			currentMachineState = new NoCashState(this.machine);
		else if(this.cashAvailable == this.cashCapacity)
			currentMachineState = new FullCashState(this.machine);
		else
			currentMachineState = new CashAvailable(this.machine);
	}
	@Override
	public void deposit(double amount) throws Exception {
		  throw new Exception("Machine failure, not ready for operations");
	}
	@Override
	public void withdraw(double amount) throws Exception {
			  throw new Exception("Machine failure, not ready for operations");
	}
	
}
