package edu.mum.cs.ds.atm.model;

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
			currentMachineState = new NormalState(this.machine);
	}
	@Override
	public void Deposit(double amount) throws Exception {
		  throw new Exception("Machine failure, not ready for operations");
	}
	@Override
	public void Withdraw(double amount) throws Exception {
			  throw new Exception("Machine failure, not ready for operations");
	}
	
}
