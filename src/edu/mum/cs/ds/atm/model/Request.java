package edu.mum.cs.ds.atm.model;

public class Request {

	private String actionType;
	private String machineId;
	private String cardNo;
	private String branchCode;
	
	public Request(String actionType, String machineId, String cardNo,
			String branchCode) {
		super();
		this.actionType = actionType;
		this.machineId = machineId;
		this.cardNo = cardNo;
		this.branchCode = branchCode;
	}
	
	
	
	
}
