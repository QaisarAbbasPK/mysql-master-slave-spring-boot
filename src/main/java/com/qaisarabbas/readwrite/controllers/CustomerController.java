package com.qaisarabbas.readwrite.controllers;

import com.qaisarabbas.readwrite.entities.Customers;
import com.qaisarabbas.readwrite.model.CustomerRequest;
import com.qaisarabbas.readwrite.services.CustomerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("api")
public class CustomerController {

    private final CustomerService customerService;

    @PostMapping("create-customer")
    public Customers createCustomer(@RequestBody CustomerRequest request) {
        log.info("CustomerController::createCustomer(): Customer Name: {}", request.getName());
        return customerService.createCustomer(request);
    }

    @GetMapping("all-customers")
    public List<Customers> getCustomers() {
        return customerService.getCustomer();
    }
}
