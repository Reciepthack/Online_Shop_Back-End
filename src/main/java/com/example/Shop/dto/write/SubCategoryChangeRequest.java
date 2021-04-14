package com.example.Shop.dto.write;

import com.example.Shop.dto.read.SubCategoryBaseDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class SubCategoryChangeRequest {
    private SubCategoryBaseDto subCategoryDto;
    private Long categoryId;

}
