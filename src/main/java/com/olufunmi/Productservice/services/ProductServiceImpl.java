package com.olufunmi.Productservice.services;

import com.olufunmi.Productservice.data.models.Product;
import com.olufunmi.Productservice.data.repositories.ProductRepository;
import com.olufunmi.Productservice.dtos.ProductRequest;
import com.olufunmi.Productservice.dtos.ProductResponse;
import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@Slf4j
public class ProductServiceImpl implements ProductService{
    @Autowired
    private ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public void createProduct(ProductRequest productRequest) {
        Product product = Product.builder()
                .description(productRequest.getDescription())
                .name(productRequest.getName())
                .price(productRequest.getPrice())
                .build();

        productRepository.save(product);
        log.info("Product has been saved with id {}", product.getId());

    }

    @Override
    public List<ProductResponse> findAllProducts() {
        List<Product> allProducts = productRepository.findAll();
         return allProducts.stream().map(this::createProductResponseObject).toList();
    }

    private ProductResponse createProductResponseObject(Product product) {
        return ProductResponse.builder()
                .id(product.getId())
                .description(product.getDescription())
                .name(product.getName())
                .price(product.getPrice())
                .build();
    }
}
