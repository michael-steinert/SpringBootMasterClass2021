package com.example.SpringBootMasterClass2021.customer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    @GetMapping
    public Customer getCustomer(){
        return new Customer(1L, "Michael");
    }
}
