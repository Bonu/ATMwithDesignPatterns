package edu.mum.cs.ds.atm.model.state;

import edu.mum.cs.ds.atm.model.ATMMachine;

public class CashAvailable extends MachineState {

	public CashAvailable(MachineState state)
	{
		this.cashAvailable = state.cashAvailable;
	}
	public CashAvailable(ATMMachine machine)
	{
		this.machine = machine;
	}
	@Override
	public void deposit(double amount) throws Exception {
		if(cashAvailable+amount == cashCapacity)
		{
			cashAvailable +=amount;
			this.machine.setState(new FullCashState(this));
		}
		else if(cashAvailable< cashCapacity ) {
			cashAvailable +=amount; //Stay in the same state
		}
		else
			throw new Exception("Cash loading exceeding machine capacity, please check and load appropriate amount");
	}

	@Override
	public void withdraw(double amount) throws Exception {
		try {
			if(cashAvailable-amount == 0 ) 
			{
				cashAvailable -=amount;
				this.machine.setState(new NoCashState(this));
			}
			if(cashAvailable-amount > 0 ) {
				cashAvailable -=amount;
			}
			else
				throw new Exception("No Sufficient fund in the machine");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
