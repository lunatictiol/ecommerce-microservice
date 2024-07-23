package com.sab.ecommerce.mapper;


import com.sab.ecommerce.domain.Customer;
import com.sab.ecommerce.domain.CustomerRequest;
import com.sab.ecommerce.domain.CustomerResponse;
import org.springframework.stereotype.Component;

    @Component
    public class CustomerMapper {

        public Customer toCustomer(CustomerRequest request) {
            if (request == null) {
                return null;
            }
            return Customer.builder()
                    .id(request.id())
                    .firstname(request.firstname())
                    .lastname(request.lastname())
                    .email(request.email())
                    .address(request.address())
                    .build();
        }

        public CustomerResponse fromCustomer(Customer customer) {
            if (customer == null) {
                return null;
            }
            return new CustomerResponse(
                    customer.getId(),
                    customer.getFirstname(),
                    customer.getLastname(),
                    customer.getEmail(),
                    customer.getAddress()
            );
        }
    }