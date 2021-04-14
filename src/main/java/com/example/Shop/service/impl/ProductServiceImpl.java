package com.example.Shop.service.impl;

import com.example.Shop.dto.read.ProductDto;
import com.example.Shop.model.Product;
import com.example.Shop.repo.ProductRepository;
import com.example.Shop.service.ProductService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;


@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;
    private final ModelMapper mapper;

    @Autowired
    public ProductServiceImpl(ProductRepository productRepository, ModelMapper mapper) {
        this.productRepository = productRepository;
        this.mapper = mapper;
    }

    @Override
    public ProductDto getOne(Long id) {
        return mapper.map(productRepository.getOne(id), ProductDto.class);
    }

    @Override
    public List<ProductDto> findAll() {
        return productRepository.findAll()
                .stream()
                .map( p -> mapper.map(p, ProductDto.class))
                .collect(Collectors.toList());
    }

    @Override
    public Product save(ProductDto dto) {
        dto.setLocalDate(LocalDate.now());
        return productRepository.save(mapper.map(dto, Product.class));
    }


    @Override
    public List<ProductDto> findBySlug(String slug) {
        return productRepository.findBySlug(slug)
                .stream()
                .map( p -> mapper.map(p, ProductDto.class))
                .collect(Collectors.toList());
    }
}
