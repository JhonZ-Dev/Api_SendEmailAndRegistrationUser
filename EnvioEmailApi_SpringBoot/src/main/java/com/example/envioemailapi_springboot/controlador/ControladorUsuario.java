package com.example.envioemailapi_springboot.controlador;

import com.example.envioemailapi_springboot.servicio.ServicioUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class ControladorUsuario {

    private final ServicioUsuario usuarioServicio;



    @Autowired
    public ControladorUsuario(ServicioUsuario usuarioServicio) {
        this.usuarioServicio = usuarioServicio;
    }
}
