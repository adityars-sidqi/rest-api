package com.sdd.restapi.controller;

import com.sdd.restapi.domain.Mcustomer;
import com.sdd.restapi.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping("/customers")
    public Page<Mcustomer> getCustomers(Pageable pageable) {
        return customerRepository.findAll(pageable);
    }

    @PostMapping("/customers")
    public Mcustomer createCustomer(@Valid @RequestBody Mcustomer mcustomer) {
        return customerRepository.save(mcustomer);
    }

}
