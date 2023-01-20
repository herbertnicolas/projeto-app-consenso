package com.app.consenso.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.consenso.model.Usuario;
import com.app.consenso.service.UsuarioService;

@RestController
public class UsuarioController {
    @PostMapping("/usuarios")
    public Usuario criarNovoUsuario(@RequestBody Usuario usuario){
        return usuarioService.save(usuario);
    }

    @GetMapping("/usuarios")
    public Iterable<Usuario> obterTodosUsuario(){
        return usuarioService.findAll();
    }

    @PutMapping("/usuarios/{id}")
    public Usuario atualizaUsuario(@RequestBody Usuario usuario){
        Usuario usuarioAtt = usuarioService.findById(usuario.getIdUsuario()).get();
        usuarioAtt.setNome(usuario.getNome());
        usuarioAtt.setSobrenome(usuario.getSobrenome());
        usuarioAtt.setEmail(usuario.getEmail());
        usuarioAtt.setSenha(usuario.getSenha());
        usuarioService.save(usuarioAtt);

        return usuarioAtt;
    }

    @DeleteMapping("/usuarios/{id}")
    public String removeUsuarioPorId(@PathVariable("id") Integer id){
        usuarioService.deleteById(id);
        return "Contato removido com sucesso!";
    }

    @Autowired
    private UsuarioService usuarioService;
}



