package com.sab.ecommerce.repository;

import com.sab.ecommerce.domain.order.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Integer> {

}