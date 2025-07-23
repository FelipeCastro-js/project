package com.projectjava.project.controllers;

import com.projectjava.project.models.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsuarioController {

    @RequestMapping(value= "usuario/id")
    public Usuario getUsuario(@PathVariable Long id){
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setName("Felipe");
        usuario.setLastname("Castro");
        usuario.setEmail("carloscastro1860@gmail.com");

        return usuario;
    }
}
