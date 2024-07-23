package com.sab.ecommerce.domain.orderLine;


public record OrderLineRequest(
        Integer id,
        Integer orderId,
        Integer productId,
        double quantity
) {
}