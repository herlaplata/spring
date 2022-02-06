package com.pagina.walkcyw.controllers;

import com.pagina.walkcyw.models.Usuario;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsuarioController {
    @RequestMapping(value = "usuario")
    public Usuario getUsuario () {
        Usuario usuario = new Usuario();
        usuario.setApellido("Mam");
        usuario.setEmail("ejemplo@gmail.com");
        usuario.setNombre("Her");
        usuario.setPassword("contrasenia");
        usuario.setTelefono("123456789");
        return usuario;

    }
}
