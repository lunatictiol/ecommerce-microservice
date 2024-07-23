package com.sab.ecommerce.service;

import com.sab.ecommerce.domain.ProductPurchaseRequest;
import com.sab.ecommerce.domain.ProductPurchaseResponse;
import com.sab.ecommerce.domain.ProductRequest;
import com.sab.ecommerce.domain.ProductResponse;

import java.util.List;

public interface ProductService {
    public Integer createProduct(
            ProductRequest request
    );
    public ProductResponse findById(Integer id);
    public List<ProductResponse> findAll();
    public List<ProductPurchaseResponse> purchaseProducts(
            List<ProductPurchaseRequest> request
    );
}
