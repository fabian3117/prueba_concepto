package com.example.backbase.controllers;

import com.example.backbase.dtos.ClienteDTO;
import com.example.backbase.services.ClienteService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cliente")
@RequiredArgsConstructor
public class ClienteController {
private final ClienteService clienteService;

    @GetMapping("/")
    private ClienteDTO getCliente(@RequestAttribute("userId")Long id) {
        return clienteService.getClienteById(id);
//        return "<h1>Clientes</h1>";
    }
//    @GetMapping("/")
}
