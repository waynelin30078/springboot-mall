package com.linwayne.springbootmall.service;

import com.linwayne.springbootmall.dto.ProductRequest;
import com.linwayne.springbootmall.model.Product;

public interface ProductService {
    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);
}
