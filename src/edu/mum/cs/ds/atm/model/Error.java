package edu.mum.cs.ds.atm.model;

import java.io.Serializable;

public class Error implements Serializable {

	public String Id;
	public String errorType;
	public String errorCategory;
	public String errorDescription;
	public String parent;
	public Error(String id, String errorType, String errorCategory,
			String errorDescription, String parent) {
		super();
		Id = id;
		this.errorType = errorType;
		this.errorCategory = errorCategory;
		this.errorDescription = errorDescription;
		this.parent = parent;
	}
	public String getId() {
		return Id;
	}
	public String getErrorType() {
		return errorType;
	}
	public String getErrorCategory() {
		return errorCategory;
	}
	public String getErrorDescription() {
		return errorDescription;
	}
	public String getParent() {
		return parent;
	}
	
}
