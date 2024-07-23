package com.sab.ecommerce.repository;
import com.sab.ecommerce.domain.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepository extends MongoRepository<Customer, String > {

}