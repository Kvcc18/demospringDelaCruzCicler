package com.desarrollo.controllers;

import com.desarrollo.entities.ChangePasswordRequest;
import com.desarrollo.entities.Login;
import com.desarrollo.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioRESTController {
    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("/loginrest")
    public ResponseEntity<String> login(@RequestBody Login login){
        if(usuarioService.login(login.getUsername(), login.getPassword())){
            return new ResponseEntity<String>("ADDED USER", HttpStatus.OK);
        }
        else{
            return new ResponseEntity<String>("NOT FOUND", HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/changepasswordrest")
    public ResponseEntity<String> changePassword(@RequestBody ChangePasswordRequest changePassRequest){
        if(usuarioService.changePassword(changePassRequest.getUsername(), changePassRequest.getOldPass(), changePassRequest.getNewPass())){
            return new ResponseEntity<String>("SUCCESSFUL CHANGE", HttpStatus.OK);
        }
        else{
            return new ResponseEntity<String>("FAILED CHANGE, WRONG DATA", HttpStatus.NOT_FOUND);
        }
    }
}
