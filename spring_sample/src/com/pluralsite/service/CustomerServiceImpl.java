package com.pluralsite.service;

import java.util.List;

import com.pluralsite.model.Customer;
import com.pluralsite.repository.CustomerRepository;
import com.pluralsite.repository.HibernateCustomerRepositoryImpl;

public class CustomerServiceImpl implements CustomerService {

	private CustomerRepository customerRepository = new HibernateCustomerRepositoryImpl();
	
	@Override
	public List<Customer> finfAll() {
		return customerRepository.findAll();
	}
}
