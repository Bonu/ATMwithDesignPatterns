package edu.mum.cs.ds.atm.model;

public class Request {

	private String actionType; //withdraw, check balance, 
	private String machineId;
	private String cardNo;
	private String branchCode;
	private double amount;
	private String status;
	private String message;
	
	
	public Request(String actionType, String machineId, String cardNo,
			String branchCode) {
		super();
		this.actionType = actionType;
		this.machineId = machineId;
		this.cardNo = cardNo;
		this.branchCode = branchCode;
	}

	
	public Request(String actionType, String machineId, String cardNo,
			String branchCode, double amount) {
		super();
		this.actionType = actionType;
		this.machineId = machineId;
		this.cardNo = cardNo;
		this.branchCode = branchCode;
		this.amount = amount;
	}


	public String getActionType() {
		return actionType;
	}

	public String getMachineId() {
		return machineId;
	}

	public String getCardNo() {
		return cardNo;
	}

	public String getBranchCode() {
		return branchCode;
	}

	public double getAmount() {
		return amount;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
	
}
