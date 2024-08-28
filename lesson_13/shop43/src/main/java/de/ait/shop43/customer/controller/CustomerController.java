package de.ait.shop43.customer.controller;


import de.ait.shop43.customer.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor

public class CustomerController {

    private final CustomerService service;



}
