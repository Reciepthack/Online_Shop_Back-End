package com.example.Shop.service;


import com.example.Shop.dto.read.ProductDto;
import com.example.Shop.model.Product;

import java.util.List;

public interface ProductService {
    ProductDto getOne(Long id);

    List<ProductDto> findAll();

    List<ProductDto> findBySlug(String slug);

    Product save(ProductDto product);
}