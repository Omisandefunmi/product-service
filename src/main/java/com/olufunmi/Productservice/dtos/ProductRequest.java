package com.olufunmi.Productservice.dtos;

import lombok.*;

import java.math.BigDecimal;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class ProductRequest {
    private String name;
    private String description;
    private BigDecimal price;

}
