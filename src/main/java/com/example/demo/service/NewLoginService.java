package com.example.demo.service;

import com.example.demo.entity.*;
import com.example.demo.repository.loginRepository;
import com.example.demo.repository.rolUsuarioRepository;
import com.example.demo.repository.rolUsuarioMenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

/*@RestController
@RequestMapping("/login")
@CrossOrigin*/
public class NewLoginService {

    /*@Autowired
    loginRepository loginRepository;

    //Servicio que devuelve un objeto del user si lo encuentra si es en blanco o null es porque no pasa la validacion
    @PostMapping(path = "/user")
    private ArrayList loginTeacher(@RequestBody login credentials) {
        ArrayList usuario =new ArrayList<>();
        usuario.add(login(credentials));
        return usuario;
    }

    private ArrayList user(User credentials){
        ArrayList roles = new ArrayList<>();
        int longitud = userRepository.findByIdUsuarioAndContrasenia(credentials.getIdUsuario(),credentials.getContrasenia()).size();
        if(longitud>0){
            Optional<rolUsuario> rolUsuario = rolUsuarioRepository.findById(credentials.getIdUsuario());
            Optional<rolUsuarioMenu> rolUsuarioMenu = rolUsuarioMenuRepository.findById(credentials.getIdUsuario());
            Optional<User> usuario= userRepository.findById(credentials.getIdUsuario());
            roles.add(usuario);
            roles.add(rolUsuario);
            roles.add(rolUsuarioMenu);
            return roles;
        }else{
            User  usario= new User();
            usario.setIdUsuario(0);
            rolUsuarioMenu rolis = new rolUsuarioMenu();
            roles.add(usario);
            roles.add(rolis);
            return roles;
        }

    }*/
}
