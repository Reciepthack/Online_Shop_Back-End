package com.example.Shop.dto.write;


import com.example.Shop.dto.read.CategoryBaseDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CategoryChangeRequest {
    CategoryBaseDto dto;
}