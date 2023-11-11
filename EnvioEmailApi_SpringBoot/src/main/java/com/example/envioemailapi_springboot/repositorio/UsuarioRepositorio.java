package com.example.envioemailapi_springboot.repositorio;

import com.example.envioemailapi_springboot.modelo.ModeloUsuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepositorio extends JpaRepository<ModeloUsuario, Long> {

    ModeloUsuario findByEmail(String email);
}
