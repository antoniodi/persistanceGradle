package com.tutorial.persistance.models.dao;

import com.tutorial.persistance.models.entity.Customer;

import java.util.List;

public interface ICustomerDao {

    public List<Customer> findAll();

    void save(Customer aCustomer);
}
