package com.src.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.src.dao.CustomerDAO;
import com.src.entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
    private CustomerDAO customerDAO;

    @Override
    @Transactional
    public List < Customer > getCustomers() {
        return (List<Customer>) customerDAO.findAll();
    }

    @Override
    @Transactional
    public void saveCustomer(Customer theCustomer) {
        customerDAO.save(theCustomer);
    }

    @Override
    @Transactional
    public Optional<Customer> getCustomer(int theId) {
        return customerDAO.findById(theId);
    }

    @Override
    @Transactional
    public void deleteCustomer(Customer theCustomer) {
        customerDAO.delete(theCustomer);
    }
}
