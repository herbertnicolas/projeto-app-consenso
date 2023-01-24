package com.app.consenso.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.consenso.model.Servico;
import com.app.consenso.service.ServicoService;

@RestController
public class ServicoController {
    @PostMapping("/servicos")
    public Servico criarNovoServico(@RequestBody Servico servico){
        return servicoService.save(servico);
    }

    @GetMapping("/servicos")
    public Iterable<Servico> obterTodosUsuarios(){
        return servicoService.findAll();
    }

    @GetMapping("/servicos/{id}")
    public Servico oterServicoPorId(@PathVariable("id") Integer id){
        return servicoService.findById(id).get();
    }
    @PutMapping("/servicos/{id}")
    public Servico atualizaServico(@RequestBody Servico servico){
        Servico servicoAtt = servicoService.findById(servico.getIdServico()).get();
        servicoAtt.setNome(servico.getNome());
        servicoAtt.setDescricao(servico.getDescricao());

        return servicoAtt;
    }

    @DeleteMapping("/servicos/{id}")
    public String removeServicoPorId(@PathVariable("id") Integer id){
        servicoService.deleteById(id);
        
        return "Serviço removido com sucesso!";
    }
    @Autowired
    private ServicoService servicoService;
}
