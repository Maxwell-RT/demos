package com.Libreria.demos.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;

import com.Libreria.demos.model.Usuario;
import jakarta.transaction.Transactional;

@Transactional
@Service

public class UsuarioService<usuarioRepository> {
@Autowired
    private usuarioRepository UsuarioRepository;

    public Usuario crear(Usuario usuario){
        return UsuarioRepository.save(usuario);

        
    }

    public List<Usuario> listar(){
        return UsuarioRepository.findAll();
    }

    }

