package com.projects.service;

import com.projects.model.Customer;
import com.projects.repository.CustomerRepository;
import com.projects.repository.HibernateCustomerRepositoryImpl;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {
    private CustomerRepository customerRespository = new HibernateCustomerRepositoryImpl();

    public List<Customer> findAll() {
        return customerRespository.findAll();
    }

}
