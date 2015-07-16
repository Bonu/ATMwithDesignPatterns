package edu.mum.cs.ds.atm.helper;

import java.util.HashMap;

import edu.mum.cs.ds.atm.model.Card;
import edu.mum.cs.ds.atm.model.Customer;

public class CustomerImplementor {
	
	public CustomerImplementor() {
		
	}
	
	public String getCustomerPhone(String accountId){
		CustomerTable ct = new CustomerTable();
		Customer customer = ct.getCustomer(accountId);
		return customer.getPhone();
	}
	
}


class CustomerTable {
	
	HashMap<String,Customer> customers = new HashMap<String,Customer>();
	
	public CustomerTable(){
		this.loadData();
	}
	
	public Customer getCustomer(String accountId){
		 return customers.get(accountId);
	}
	
	public void loadData(){
		customers.put("111111111", new Customer("customer1","FirstLastName1","Address1","111111111"));
		customers.put("222222222", new Customer("customer2","FirstLastName2","Address2","222222222"));
		customers.put("333333333", new Customer("customer3","FirstLastName3","Address3","333333333"));
		customers.put("444444444", new Customer("customer4","FirstLastName4","Address4","444444444"));
		customers.put("555555555", new Customer("customer1","FirstLastName5","Address5","555555555"));
		customers.put("666666666", new Customer("customer1","FirstLastName6","Address6","666666666"));
		customers.put("777777777", new Customer("customer1","FirstLastName7","Address7","777777777"));
		customers.put("888888888", new Customer("customer1","FirstLastName8","Address8","888888888"));
		customers.put("999999999", new Customer("customer1","FirstLastName9","Address9","999999999"));
		customers.put("111111112", new Customer("customer1","FirstLastName12","Address12","111111112"));
	}
	
}



