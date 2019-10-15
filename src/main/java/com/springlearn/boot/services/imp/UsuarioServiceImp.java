package com.springlearn.boot.services.imp;

import com.springlearn.boot.model.Status;
import com.springlearn.boot.model.Usuario;
import com.springlearn.boot.repository.StatusRepository;
import com.springlearn.boot.repository.UsuarioRepository;
import com.springlearn.boot.services.interfaces.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UsuarioServiceImp implements UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private StatusRepository statusRepository;

    @Override
    public void create(Usuario usuario) {
        Status status = statusRepository.findById(3).get();
        usuario.setStatus(status);
        usuarioRepository.save(usuario);
    }

    public void delete(Integer id) {
        Status status = statusRepository.findById(2).get();

        Usuario usuario = usuarioRepository.findById(id).get();
        usuario.setStatus(status);
        usuarioRepository.save(usuario);
    }
}
