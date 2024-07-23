package com.sab.ecommerce.domain.orderLine;

public record OrderLineResponse(
        Integer id,
        double quantity
) { }