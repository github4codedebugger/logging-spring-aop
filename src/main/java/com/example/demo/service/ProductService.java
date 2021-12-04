package com.example.demo.service;

import com.example.demo.repository.ProductRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ProductService {

    @Autowired
    private ProductRepo repo;

    public String getProductName() {
        log.info("received request for getProductName");
        return repo.getProductName();
    }
}
