package com.Libreria.demos.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Usuario {

@Column(nullable = false)
private String nombre;

@Column(nullable = false)
private String apellido;

@Column(nullable = false)
private String nickname;

@Column(nullable = false)
private String contraseña;

@Id
@GeneratedValue (strategy = GenerationType.IDENTITY)
private Integer rut;



    
}
