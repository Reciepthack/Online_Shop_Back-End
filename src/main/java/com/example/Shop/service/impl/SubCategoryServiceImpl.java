package com.example.Shop.service.impl;

import com.example.Shop.dto.read.SubCategoryDto;
import com.example.Shop.model.SubCategory;
import com.example.Shop.repo.SubCategoryRepository;
import com.example.Shop.service.SubCategoryService;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class SubCategoryServiceImpl implements SubCategoryService {
    private final SubCategoryRepository subCategoryRepository;
    private final ModelMapper mapper;

    public SubCategoryServiceImpl(SubCategoryRepository subCategoryRepository, ModelMapper mapper) {
        this.subCategoryRepository = subCategoryRepository;
        this.mapper = mapper;
    }

    @Override
    public SubCategoryDto getOne(Long id) {
        return mapper.map(subCategoryRepository.getOne(id), SubCategoryDto.class);
    }

    @Override
    public List<SubCategoryDto> findAll(Sort.Direction desc, String localDate) {
        return subCategoryRepository.findAll()
                .stream()
                .map(p -> mapper.map(p, SubCategoryDto.class))
                .collect(Collectors.toList());
    }

    @Override
    public SubCategory save(SubCategoryDto dto) {
        dto.setLocalDate(LocalDate.now());
        return subCategoryRepository.save(mapper.map(dto, SubCategory.class));
    }


}
