package com.app.consenso.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.consenso.model.Agendamento;

public interface AgendamentoService extends JpaRepository<Agendamento, Integer>{
    
}
