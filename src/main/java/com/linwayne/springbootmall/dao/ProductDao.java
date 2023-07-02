package com.linwayne.springbootmall.dao;

import com.linwayne.springbootmall.model.Product;

public interface ProductDao {
    Product getProductById(Integer productId);
}
