package com.raphtallia.departusuario.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.raphtallia.departusuario.entities.Usuario;
import com.raphtallia.departusuario.repository.RepositorioUsuario;

@RestController
@RequestMapping("/usuarios")
public class ControleUsuario {
    
    @Autowired
    private RepositorioUsuario repository;

    @GetMapping
    public List<Usuario> findAll() {
        List<Usuario> resultado = repository.findAll();
        return resultado;
    }
}
