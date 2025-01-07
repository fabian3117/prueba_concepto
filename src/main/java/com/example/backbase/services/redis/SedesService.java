package com.example.backbase.services.redis;


import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class SedesService {

    @Cacheable(value = "products", key = "#id")
    public String getProductById(String id) {
        // Simula una operación lenta
        return "Product " + id;
    }

}
