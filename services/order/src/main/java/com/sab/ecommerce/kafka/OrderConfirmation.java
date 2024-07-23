package com.sab.ecommerce.kafka;

import com.sab.ecommerce.clients.customer.CustomerResponse;
import com.sab.ecommerce.clients.product.PurchaseResponse;
import com.sab.ecommerce.domain.PaymentMethod;

import java.math.BigDecimal;
import java.util.List;

public record OrderConfirmation (
        String orderReference,
        BigDecimal totalAmount,
        PaymentMethod paymentMethod,
        CustomerResponse customer,
        List<PurchaseResponse> products

) {
}