package com.linwayne.springbootmall.service;

import com.linwayne.springbootmall.dto.ProductQueryParams;
import com.linwayne.springbootmall.dto.ProductRequest;
import com.linwayne.springbootmall.model.Product;

import java.util.List;

public interface ProductService {

    List<Product> getProducts(ProductQueryParams productQueryParams);

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId , ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
