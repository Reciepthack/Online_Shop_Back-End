package com.example.Shop.service;


import com.example.Shop.dto.read.SubCategoryDto;
import com.example.Shop.model.SubCategory;
import org.springframework.data.domain.Sort;

import java.util.List;

public interface SubCategoryService {
    SubCategoryDto getOne(Long id);

    List<SubCategoryDto> findAll(Sort.Direction desc, String localDate);

    SubCategory save(SubCategoryDto subCategory);
}
