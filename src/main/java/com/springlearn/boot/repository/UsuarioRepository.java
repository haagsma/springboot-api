package com.springlearn.boot.repository;

import com.springlearn.boot.model.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Integer> {
    public List<Usuario> findByNomeIgnoreCaseContaining(String nome);
    public Usuario findByEmailIgnoreCase(String email);
}
