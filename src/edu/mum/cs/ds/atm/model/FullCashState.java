package edu.mum.cs.ds.atm.model;

public class FullCashState extends MachineState {

	public FullCashState(MachineState state)
	{
		this.cashAvailable = state.cashAvailable;
	}
	public FullCashState(ATMMachine machine)
	{
		this.machine = machine;
	}
	@Override
	public void Deposit(double amount) throws Exception {
		  throw new Exception("Exceeding machine capacity");
	}

	@Override
	public void Withdraw(double amount) throws Exception {
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
