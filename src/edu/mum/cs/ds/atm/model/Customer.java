package edu.mum.cs.ds.atm.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Customer implements Serializable {

	private String customerId;
	private String customerName;
	private String address;
	private String phone; 
	
	public Customer(String customerId, String customerName, String address, String phone) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.address = address;
		this.phone = phone;
	}
	public String getCustomerId() {
		return customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public String getAddress() {
		return address;
	}
	public String getPhone() {
		return phone;
	}
	
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", address=" + address
				+ ", phone=" + phone + "]";
	}
	
}
