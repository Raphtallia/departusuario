package com.raphtallia.departusuario.repository;

import com.raphtallia.departusuario.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioUsuario extends JpaRepository<Usuario, Long> {
    
}