package de.ait.shop43.product.service;

import de.ait.shop43.product.dto.RequestProductDTO;
import de.ait.shop43.product.dto.ResponseProductDTO;

import java.util.List;

public interface ProductService {
    List<ResponseProductDTO> findAll();
    ResponseProductDTO save(RequestProductDTO dto);

    ResponseProductDTO update(Long id, RequestProductDTO dto);

    ResponseProductDTO updateActiveStatus(Long productId, boolean active);

    List<ResponseProductDTO> findByTitle(String title);
}