package com.sab.ecommerce.service;

import com.sab.ecommerce.domain.Customer;
import com.sab.ecommerce.domain.CustomerRequest;
import com.sab.ecommerce.domain.CustomerResponse;

import java.util.List;

public interface CustomerService {
    public String createCustomer(CustomerRequest request);
    public void updateCustomer(CustomerRequest request);
    public List<CustomerResponse> findAllCustomers();
    public CustomerResponse findById(String id);
    public boolean existsById(String id);
    public void deleteCustomer(String id);
}
