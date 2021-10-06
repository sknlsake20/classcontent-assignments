package com.src.service;

import java.util.List;
import java.util.Optional;

import com.src.entity.Customer;

public interface CustomerService {

    public List < Customer > getCustomers();

    public void saveCustomer(Customer theCustomer);

    public Optional<Customer> getCustomer(int theId);

    public void deleteCustomer(Customer theCustomer);

}
