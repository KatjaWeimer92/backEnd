package de.ait.shop43.cart.dto;

import de.ait.shop43.product.dto.ResponseProductDTO;

import java.util.List;

public class CartResponseDto {
    private Long id;
    private List<ResponseProductDTO> products;
}
