package com.app.consenso.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Data
@Entity
public class Usuario {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int idUsuario;
    private String nome;
    private String sobrenome;
    private String email;
    private String senha;
 
    @OneToOne
    private TipoUsuario tipoUsuario;
    
}
// @OneToOne
