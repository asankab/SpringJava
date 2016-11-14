package com.pluralsite.repository;

import java.util.List;

import com.pluralsite.model.Customer;

public interface CustomerRepository {

	List<Customer> findAll();

}