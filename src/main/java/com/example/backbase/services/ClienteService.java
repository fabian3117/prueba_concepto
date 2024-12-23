package com.example.backbase.services;

import com.example.backbase.dtos.ClienteDTO;
import com.example.backbase.mappers.ClienteMapper;
import com.example.backbase.repository.ClientesRepository;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class ClienteService {
    private final ClientesRepository clientesRepository;
    @Autowired
    private ClienteMapper clienteMapper;

    public ClienteDTO getClienteById(@NonNull Long id) {

        return clientesRepository.findById(id).stream().map(clienteMapper::ClienteEntityToDTO).findFirst().orElse(new ClienteDTO());
    }
}
