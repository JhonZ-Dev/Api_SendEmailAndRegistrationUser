package com.example.envioemailapi_springboot.controlador;

import com.example.envioemailapi_springboot.modelo.ModeloUsuario;
import com.example.envioemailapi_springboot.servicio.ServicioUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
    @PostMapping("/register")
    public String registerUser(@RequestBody ModeloUsuario user) {
        usuarioServicio.registrarUsuario(user);
        return "Mensaje Enviado";
    }

    @PostMapping("/registrar/usuario")
    public ResponseEntity<String> registrarUsuario(@RequestBody ModeloUsuario usuario){
        usuarioServicio.registrarUsuario(usuario);
        return ResponseEntity.ok("Usuario Registrado");
    }
}
