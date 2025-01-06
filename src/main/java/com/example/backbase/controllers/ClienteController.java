package com.example.backbase.controllers;

import com.example.backbase.dtos.ClienteDTO;
import com.example.backbase.services.ClienteService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cliente")
@RequiredArgsConstructor
/**
 * Aca tengo el controlador que me da la informacion sobre mi perfil
 *
 */
public class ClienteController {
private final ClienteService clienteService;

    @GetMapping("/")
    private ClienteDTO getCliente(@RequestAttribute("userId")Long id) {
        return clienteService.getClienteById(id);
//        return "<h1>Clientes</h1>";
    }
    @GetMapping("/all/")
    @ResponseStatus(HttpStatus.OK)
    private List<ClienteDTO> getAllClientes() {
        return clienteService.getAllClients();
    }

//    @GetMapping("/")
}
