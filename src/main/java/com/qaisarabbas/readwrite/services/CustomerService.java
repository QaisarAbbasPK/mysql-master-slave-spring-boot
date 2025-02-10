package com.qaisarabbas.readwrite.services;

import com.qaisarabbas.readwrite.entities.Customers;
import com.qaisarabbas.readwrite.model.CustomerRequest;
import com.qaisarabbas.readwrite.repository.CustomersRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerService {

    private final CustomersRepository customersRepository;

    @Transactional
    public Customers createCustomer(CustomerRequest request) {
        Customers customer = Customers.builder()
                .name(request.getName())
                .email(request.getEmail())
                .address(request.getAddress())
                .phone(request.getPhone())
                .createdAt(LocalDateTime.now())
                .build();
        return customersRepository.save(customer);
    }


    //Read From Slave
    @Transactional(readOnly = true)
    public List<Customers> getCustomer() {
        return customersRepository.findAll();

    }
}
