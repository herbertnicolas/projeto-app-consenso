package com.app.consenso.model;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Agendamento {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int idAgendamento;
    private Date data;
    private Date hora;

    // @Query("SELECT a FROM Agendamento nickname WHERE ")
    // public List<Agendamento> findByUsuarioId(Long id){
        
    // }

}
