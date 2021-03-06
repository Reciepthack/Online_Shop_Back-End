package com.example.Shop.dto.read;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CategoryDto {
    private Long id;
    private String slug;
    private String name;
    private String image;
    private LocalDate localDate;
    List<SubCategoryDto> subCategories;
}