package com.app.consenso.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.consenso.model.Agendamento;
import com.app.consenso.service.AgendamentoService;

@RestController
public class AgendamentoController {
    @PostMapping("/agendamentos")
    public Agendamento criarNovoAgendamento(@RequestBody Agendamento a){
        return agendamentoService.save(a);
    }

    @GetMapping("/agendamentos")
    public Iterable<Agendamento> obterTodosAgendamentos(){
        return agendamentoService.findAll();
    } 

    @GetMapping("/agendamentos/{id}")
    public Agendamento oterAgendamentoPorId(@PathVariable("id") Integer id){
        return agendamentoService.findById(id).get();
    }

    // @GetMapping("/agendamentos/{id}")

    @PutMapping("/agendamentos/{id}")
    public Agendamento atualizaAgendamento(@RequestBody Agendamento agendamento){
        Agendamento agendamentoAtt = agendamentoService.findById(agendamento.getIdAgendamento()).get();
        agendamentoAtt.setData(agendamento.getData());
        agendamentoAtt.setHora(agendamento.getHora());

        agendamentoService.save(agendamentoAtt);
        return agendamentoAtt;
    }

    @DeleteMapping("/agendamentos/{id}")
    public String removeAgendamento(@PathVariable("id") Integer id){
        agendamentoService.deleteById(id);
        return "Agendamento removido com sucesso!";
    }

    @Autowired
    private AgendamentoService agendamentoService;
}
