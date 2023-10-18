package com.raphtallia.departusuario.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

    @GetMapping(value = "/{id}")
    public Usuario findById(@PathVariable Long id) {
        Usuario resultado = repository.findById(id).get();
        return resultado;
    }

    @PostMapping(value = "/{id}")
    public Usuario insert(@RequestBody Usuario usuario) {
        Usuario resultado = repository.save(usuario);
        return resultado;
    }
}
