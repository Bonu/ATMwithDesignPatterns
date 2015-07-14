package edu.mum.cs.ds.atm.model;

import java.io.Serializable;

public class ATMMachine implements Serializable {
	private String location;
	private String Id;
	
	public ATMMachine(String location, String id) {
		super();
		this.location = location;
		Id = id;
	}
	
	public String getLocation() {
		return location;
	}
	public String getId() {
		return Id;
	}


}
