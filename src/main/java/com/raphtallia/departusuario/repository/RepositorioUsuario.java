package com.raphtallia.departusuario.repositorios;

import com.raphtallia.departusuario.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioUsuario extends JpaRepository<Usuario, Long> {
    
}