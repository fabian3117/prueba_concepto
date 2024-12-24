package com.example.backbase.services;

import com.example.backbase.dtos.ClienteDTO;
import com.example.backbase.mappers.ClienteMapper;
import com.example.backbase.models.ClienteModel;
import com.example.backbase.repository.ClientesRepository;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

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

    public List<ClienteDTO> getAllClients() {
        return clientesRepository.findAll().stream().map(clienteMapper::ClienteEntityToDTO).collect(Collectors.toList());
    }
    public void updateClient(Long id,Long plan_id){

        ClienteModel clienteModel = clientesRepository.findById(id).orElseThrow(() -> new RuntimeException("Error don't found client"));

        clienteModel.setPlan_asociado(String.valueOf(plan_id));
        clientesRepository.save(clienteModel);
    }
}
