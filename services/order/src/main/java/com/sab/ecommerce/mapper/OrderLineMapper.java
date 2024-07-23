package com.sab.ecommerce.mapper;

import com.sab.ecommerce.domain.order.Order;
import com.sab.ecommerce.domain.orderLine.OrderLine;
import com.sab.ecommerce.domain.orderLine.OrderLineRequest;
import com.sab.ecommerce.domain.orderLine.OrderLineResponse;
import org.springframework.stereotype.Service;

@Service
public class OrderLineMapper {
    public OrderLine toOrderLine(OrderLineRequest request) {
        return OrderLine.builder()
                .id(request.orderId())
                .productId(request.productId())
                .order(
                        Order.builder()
                                .id(request.orderId())
                                .build()
                )
                .quantity(request.quantity())
                .build();
    }

    public OrderLineResponse toOrderLineResponse(OrderLine orderLine) {
        return new OrderLineResponse(
                orderLine.getId(),
                orderLine.getQuantity()
        );
    }
}