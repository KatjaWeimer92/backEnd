package de.ait.shop43.customer.dto;

import de.ait.shop43.cart.dto.CartResponseDto;

public class CustomerResponseDto {
    private Long id;
    private String name;
    private boolean active;
    private CartResponseDto cart;
}
