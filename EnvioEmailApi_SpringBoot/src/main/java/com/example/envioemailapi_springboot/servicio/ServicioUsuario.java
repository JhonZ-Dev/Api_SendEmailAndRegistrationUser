package com.example.envioemailapi_springboot.servicio;

import com.example.envioemailapi_springboot.modelo.ModeloUsuario;
import com.example.envioemailapi_springboot.repositorio.UsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class ServicioUsuario {
    @Autowired
    private final UsuarioRepositorio usuarioRepositorio;
    private final JavaMailSender mailSender;
    public ServicioUsuario(UsuarioRepositorio usuarioRepositorio, JavaMailSender mailSender) {
        this.usuarioRepositorio = usuarioRepositorio;
        this.mailSender = mailSender;
    }
    public void registrarUsuario(ModeloUsuario user){
        //verificar si el usuario ya existe
        //if(usuarioRepositorio.findByEmail(user.getEmail()) ==null){
        //guardamos en la BD
        usuarioRepositorio.save(user);

        // Envía el correo de confirmación
        sendRegistrationEmail(user.getEmail());

        //}
    }
}
