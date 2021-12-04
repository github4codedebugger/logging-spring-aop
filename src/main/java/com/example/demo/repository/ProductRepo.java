package com.example.demo.repository;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

@Repository
@Slf4j
public class ProductRepo {

    public String getProductName() {
        log.info("received request for getProductName");
        return  "Product-test"; // database call;
    }
}
