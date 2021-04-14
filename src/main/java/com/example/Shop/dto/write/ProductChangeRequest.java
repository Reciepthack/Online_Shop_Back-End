package com.example.Shop.dto.write;

import com.example.Shop.dto.read.ProductDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductChangeRequest {
    private ProductDto productDto;
    private Long subcategoryId;
}
