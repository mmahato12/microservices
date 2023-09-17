package com.ecommerce.orderservice.dto;

import java.math.BigDecimal;
import java.util.List;

import com.ecommerce.orderservice.model.OrderLineItems;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderRequest {
	private List <OrderLineItemsDto> orderLineItemsDtoList;
}
