package com.projects.repository;

import java.util.ArrayList;
import java.util.List;
import com.projects.model.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {
    public List<Customer> findAll() {
        List<Customer> customers = new ArrayList<Customer>();
        Customer customer = new Customer();
        customer.setFirstName("bryan");
        customer.setLastName("hansen");

        customers.add(customer);
        return customers;
    }

}
