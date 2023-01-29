package com.app.consenso.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.app.consenso.model.Agendamento;

public interface AgendamentoService extends JpaRepository<Agendamento, Integer>{

}
