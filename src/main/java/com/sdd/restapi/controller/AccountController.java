package com.sdd.restapi.controller;

import com.sdd.restapi.domain.Maccount;
import com.sdd.restapi.domain.Mcustomer;
import com.sdd.restapi.repository.AccountRepository;
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
public class AccountController {

    @Autowired
    private AccountRepository accountRepository;

    @GetMapping("/accounts")
    public Page<Maccount> getCustomers(Pageable pageable) {
        return accountRepository.findAll(pageable);
    }

    @PostMapping("/accounts")
    public Maccount createCustomer(@Valid @RequestBody Maccount maccount) {
        return accountRepository.save(maccount);
    }
}
