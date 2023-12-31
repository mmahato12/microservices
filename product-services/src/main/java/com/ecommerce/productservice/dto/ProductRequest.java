package com.ecommerce.productservice.dto;

import java.math.BigDecimal;

import com.ecommerce.productservice.models.Product;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class ProductRequest {
	private String id;
	private String name;
	private String description;
	private BigDecimal price;
}
