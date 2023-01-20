package com.app.consenso.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.app.consenso.model.TipoUsuario;
import com.app.consenso.service.TipoUsuarioService;

public class TipoUsuarioController {
    @PostMapping("/tipoUsuario")
    public TipoUsuario criaNovoTipoUsuario(@RequestBody TipoUsuario tipouser){
        return tipoUsuarioService.save(tipouser);
    }

    @GetMapping("/tipoUsuario")
    public Iterable<TipoUsuario> obterTodosTiposUsuario(){
        return tipoUsuarioService.findAll();
    }

    @PutMapping("/tipoUsuario")
    public TipoUsuario atualizaUsuario(@RequestBody TipoUsuario tipousuario){
        TipoUsuario tipoAtt = tipoUsuarioService.findById(tipousuario.getIdTipoUsuario()).get();
        tipoAtt.setNome(tipousuario.getNome());
        tipoUsuarioService.save(tipoAtt);

        return tipoAtt;
    }

    @DeleteMapping("/tipoUsuario/{id}")
    public String removeTipoUsuarioPorId(@PathVariable("id") Integer id){
        tipoUsuarioService.deleteById(id);
        return "Tipo de usuário removido com sucesso!";
    }
    @Autowired
    public TipoUsuarioService tipoUsuarioService;
}
