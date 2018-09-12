package com.projects.repository;

import com.projects.model.Customer;

import java.util.List;

public interface CustomerRepository {
    List<Customer> findAll();
}
