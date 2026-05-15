package com.Libreria.demos.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Libreria.demos.service.UsuarioService;
@RestController
@RequestMapping("api/v1/Usuarios")

public class UsuarioController {

private UsuarioService usuarioService;



}
