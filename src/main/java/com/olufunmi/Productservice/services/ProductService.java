package com.olufunmi.Productservice.services;

import com.olufunmi.Productservice.dtos.ProductRequest;
import com.olufunmi.Productservice.dtos.ProductResponse;

import java.util.List;

public interface ProductService {
    void createProduct(ProductRequest productRequest);

    List<ProductResponse> findAllProducts();
}
