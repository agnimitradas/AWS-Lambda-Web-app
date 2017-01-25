package com.samples.customer.mongoDB;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	private CustomerRepository repository;
	
	@RequestMapping("/all")
	public List<Customer> getAllPersons(){
		return repository.findAll();
	}
	
	@RequestMapping("/find/{lname}")
	public List<Customer> getPersonbyLastName(@PathVariable("lname") String name){
		return repository.findByLastName(name);
	}

}