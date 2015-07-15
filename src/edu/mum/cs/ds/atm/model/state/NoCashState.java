package edu.mum.cs.ds.atm.model.state;

import edu.mum.cs.ds.atm.model.ATMMachine;


public class NoCashState extends MachineState {

	public NoCashState(ATMMachine machine){
		this.machine = machine;
	}
	public NoCashState(MachineState state)
	{
		this.cashAvailable = state.cashAvailable;
	}
	@Override
	public void deposit(double amount) throws Exception {
		if(cashAvailable< cashCapacity ) {
			cashAvailable +=amount;
			this.machine.setState(new CashAvailable(this));
		}
		else
			throw new Exception("Exceeding machine capacity");
	}

	@Override
	public void withdraw(double amount) throws Exception {
		try {
			  throw new Exception("Not allowed.....No Sufficient funds");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
