package edu.mum.cs.ds.atm.model;

public class Request {

	private String actionType; //withdraw, check balance, 
	private String machineId;
	private String cardNo;
	private String branchCode;
	private double amount;
	private String status;
	private String message;
	private String accountId;
	
	
	public Request(String actionType, String machineId, String cardNo,
			String branchCode, String accountId) {
		super();
		this.actionType = actionType;
		this.machineId = machineId;
		this.cardNo = cardNo;
		this.branchCode = branchCode;
		this.accountId = accountId;
	}

	
	public Request(String actionType, String machineId, String cardNo,
			String branchCode, double amount, String accountId) {
		super();
		this.actionType = actionType;
		this.machineId = machineId;
		this.cardNo = cardNo;
		this.branchCode = branchCode;
		this.amount = amount;
		this.accountId=accountId;
		System.out.println("----- "+actionType+" request is created -------");
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


	public String getAccountId() {
		return accountId;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accountId == null) ? 0 : accountId.hashCode());
		result = prime * result + ((actionType == null) ? 0 : actionType.hashCode());
		long temp;
		temp = Double.doubleToLongBits(amount);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((branchCode == null) ? 0 : branchCode.hashCode());
		result = prime * result + ((cardNo == null) ? 0 : cardNo.hashCode());
		result = prime * result + ((machineId == null) ? 0 : machineId.hashCode());
		result = prime * result + ((message == null) ? 0 : message.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Request other = (Request) obj;
		if (accountId == null) {
			if (other.accountId != null)
				return false;
		} else if (!accountId.equals(other.accountId))
			return false;
		if (actionType == null) {
			if (other.actionType != null)
				return false;
		} else if (!actionType.equals(other.actionType))
			return false;
		if (Double.doubleToLongBits(amount) != Double.doubleToLongBits(other.amount))
			return false;
		if (branchCode == null) {
			if (other.branchCode != null)
				return false;
		} else if (!branchCode.equals(other.branchCode))
			return false;
		if (cardNo == null) {
			if (other.cardNo != null)
				return false;
		} else if (!cardNo.equals(other.cardNo))
			return false;
		if (machineId == null) {
			if (other.machineId != null)
				return false;
		} else if (!machineId.equals(other.machineId))
			return false;
		if (message == null) {
			if (other.message != null)
				return false;
		} else if (!message.equals(other.message))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Request [actionType=" + actionType + ", machineId=" + machineId + ", cardNo=" + cardNo + ", branchCode="
				+ branchCode + ", amount=" + amount + ", status=" + status + ", message=" + message + ", accountId="
				+ accountId + "]";
	}
	
	
	
}
