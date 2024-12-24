package com.example.backbase.interfaces;

import com.example.backbase.dtos.LoginDTO;
import com.example.backbase.dtos.RegisterDTO;
import com.example.backbase.models.ClienteModel;

public interface AuthInterface {
    boolean verifyCredential(ClienteModel cliente, LoginDTO loginUser);
    String createNewUser(RegisterDTO register);
    String createToken(LoginDTO loginDB);


}
