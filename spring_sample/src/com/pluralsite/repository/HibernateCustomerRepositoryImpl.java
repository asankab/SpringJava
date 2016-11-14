package com.pluralsite.repository;

import java.util.ArrayList;
import java.util.List;

import com.pluralsite.model.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {

	@Override
	public List<Customer> findAll(){
		List<Customer> customers = new ArrayList<Customer>();
		
		Customer customer = new Customer();
		
		customer.setFirstname("Asanka");
		customer.setLastname("Boteju");
		
		customers.add(customer);
		
		return customers;
	}
	
}
