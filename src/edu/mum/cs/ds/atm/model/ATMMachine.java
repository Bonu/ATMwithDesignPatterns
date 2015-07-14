package edu.mum.cs.ds.atm.model;

import java.io.Serializable;

public class ATMMachine implements Serializable {

	public String location;
	public String Id;
	public String branchCode;
	public ATMMachine(String location, String id, String branchCode) {
		super();
		this.location = location;
		Id = id;
		this.branchCode = branchCode;
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
