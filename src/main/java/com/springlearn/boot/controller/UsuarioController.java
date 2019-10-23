package com.springlearn.boot.controller;

import com.springlearn.boot.model.Usuario;
import com.springlearn.boot.repository.UsuarioRepository;
import com.springlearn.boot.services.interfaces.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RequestMapping("/user")
@RestController
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/info")
    public Map<String, String> userInfo() {
        Map<String, String> info = new HashMap<>();
        info.put("Nome", "Jhonatan");
        return info;
    }

    @GetMapping("/all")
    public @ResponseBody Iterable<Usuario> getAll() {
        return usuarioRepository.findAll();
    }

    @GetMapping("/findByNome/{nome}")
    public ResponseEntity<?> getUsuarioByNome(@PathVariable String nome) {
        return new ResponseEntity<>(usuarioRepository.findByNomeIgnoreCaseContaining(nome), HttpStatus.OK);
    }

    @PutMapping("/add")
    public ResponseEntity<?> add(@RequestBody Usuario usuario){
        usuarioService.create(usuario);
        return new ResponseEntity(HttpStatus.CREATED);
    }
}
