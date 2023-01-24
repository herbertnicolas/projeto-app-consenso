package com.app.consenso.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class TipoUsuario {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int idTipoUsuario;
    private String nome;    
    
}