package com.example.backbase.services;

import com.example.backbase.dtos.LoginDTO;
import com.example.backbase.dtos.RegisterDTO;
import com.example.backbase.interfaces.AuthInterface;
import com.example.backbase.mappers.ClienteMapper;
import com.example.backbase.mappers.RegisterMapper;
import com.example.backbase.models.ClienteModel;
import com.example.backbase.repository.ClientesRepository;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@Slf4j
@RequiredArgsConstructor
//TODO FALTA LOGICA DE COMPENSACION ANTE FALLOS ( NO ES TOLERANTE A FALLOS ACTUALMENTE )
public class AuthService implements AuthInterface {
    @Autowired
    private final ClientesRepository clientesRepository;
    @Autowired
    private ClienteMapper clienteMapper;
    @Autowired
    private RegisterMapper registerMapper;



    public String autheUser(@NonNull LoginDTO loginDTO) {

        List<ClienteModel> clientesl=clientesRepository.findByEmail(loginDTO.getEmail());
        if(clientesl.size() != 1){
            throw new RuntimeException("Error user don't exist or is repead");
        }

        //--->  El cliente existe <---
        //--->  Ahora tengo que verificar la clave y en caso correcto generar un token  <---
        if(verifyCredential(clientesl.get(0),loginDTO)){

            throw new RuntimeException("Wrong password");
        }
        return createToken(loginDTO);
//        return false;
    }

    @Override
    public boolean verifyCredential(ClienteModel cliente, LoginDTO loginUser) {
        return(!cliente.getPassword().equals(loginUser.getPassword()));

    }

    @Override
    public String createToken(LoginDTO loginDB) {
        return "0xFCE";
    }

    /**
     * Verifico por email las colisiones    <---
     * @param register
     * @return
     */
    @Override
    public String createNewUser(RegisterDTO register) {
        if(clientesRepository.existsByEmail(register.getEmail())){
            new RuntimeException("Email already in use");

        }
        ClienteModel datosGuardados=clientesRepository.save(clienteMapper.RegisterDTOToClienteModel(register));

        return createToken(registerMapper.RegisterToLoginDTO(datosGuardados));

    }

    public ResponseEntity<String> createUser(@NonNull RegisterDTO registro) {
        return ResponseEntity.ok(createNewUser(registro));
    }
}
