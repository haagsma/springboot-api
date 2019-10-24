package com.springlearn.boot.services;

import com.springlearn.boot.model.Usuario;
import com.springlearn.boot.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomUserDetails implements UserDetailsService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Usuario usuario = Optional.ofNullable(usuarioRepository.findByEmailIgnoreCase(email)).orElseThrow(() -> new UsernameNotFoundException("Usuario não encontrado!"));
        List<GrantedAuthority> grantedAuthorities = AuthorityUtils.createAuthorityList("ADMIN", "USER");
        return new User(usuario.getNome(), usuario.getSenha(), grantedAuthorities);
    }

}