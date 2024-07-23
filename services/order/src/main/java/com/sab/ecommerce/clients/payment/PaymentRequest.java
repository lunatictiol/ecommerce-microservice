package com.sab.ecommerce.clients.payment;


import com.sab.ecommerce.clients.customer.CustomerResponse;
import com.sab.ecommerce.domain.PaymentMethod;

import java.math.BigDecimal;

public record PaymentRequest(
        BigDecimal amount,
        PaymentMethod paymentMethod,
        Integer orderId,
        String orderReference,
        CustomerResponse customer
) {
}