package com.app.consenso.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Servico {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int idServico;
    private String nome;
    private String descricao;
    

}
