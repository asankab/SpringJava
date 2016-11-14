package com.pluralsite.service;

import java.util.List;

import com.pluralsite.model.Customer;
import com.pluralsite.repository.CustomerRepository;

public class CustomerServiceImpl implements CustomerService {

	//private CustomerRepository customerRepository = new HibernateCustomerRepositoryImpl();
	private CustomerRepository customerRepository;
	
	public void setCustomerRepository(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}
	
	public CustomerServiceImpl(){
		
	}
	
	public CustomerServiceImpl(CustomerRepository customerRepository){
		this.customerRepository = customerRepository;
	}

	@Override
	public List<Customer> finfAll() {
		return customerRepository.findAll();
	}
}

