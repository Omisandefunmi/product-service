package com.olufunmi.Productservice.dtos;

import lombok.*;

import java.math.BigDecimal;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class ProductResponse {
    private String id;
    private String name;
    private String description;
    private BigDecimal price;
}
