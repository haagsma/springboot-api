package com.springlearn.boot.services.imp;

import com.springlearn.boot.model.Usuario;
import com.springlearn.boot.repository.UsuarioRepository;
import com.springlearn.boot.services.interfaces.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImp implements UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public void create(Usuario usuario) {
        usuarioRepository.save(usuario);
    }
}
