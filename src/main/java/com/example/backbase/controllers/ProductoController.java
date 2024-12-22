package com.example.backbase.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/producto/")
@RequiredArgsConstructor
public class ProductoController {
    @GetMapping("/{id_producto}")
    /**
     * El cliente quiere comprar un producto
     */
    public String buyProducto(@PathVariable Long id_producto) {
        return "index";
    }
}
