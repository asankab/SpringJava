package com.pluralsite.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import com.pluralsite.model.Customer;

@Repository("customerRepository")
public class HibernateCustomerRepositoryImpl implements CustomerRepository {

	@Value("${someProperty}")
	private String someValue;
	
	@Override
	public List<Customer> findAll(){
		List<Customer> customers = new ArrayList<Customer>();
		
		Customer customer = new Customer();
		
		customer.setFirstname(someValue);
		customer.setLastname("Boteju");
		
		customers.add(customer);
		
		return customers;
	}
	
}
