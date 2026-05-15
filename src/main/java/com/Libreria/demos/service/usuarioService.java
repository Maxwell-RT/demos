package com.Libreria.demos.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;

import com.Libreria.demos.model.Usuario;
import com.Libreria.demos.repository.UsuarioRepository;

import jakarta.transaction.Transactional;

@Transactional
@Service

public class UsuarioService {
@Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario creaUsuario(Usuario usuario){
        return UsuarioRepository.save();
    }

    @SuppressWarnings("unchecked")
    public List<Usuario> listar(){
        return usuarioRepository.findAll();

    }

    @SuppressWarnings("unchecked")
    public void eliminar(Integer rut){
        usuarioRepository.deleteById(rut);
    }







    }

