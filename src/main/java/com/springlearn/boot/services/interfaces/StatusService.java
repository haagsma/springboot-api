package com.springlearn.boot.services.interfaces;

import com.springlearn.boot.model.Usuario;

public interface StatusService {

    public abstract void create(Usuario usuario);

    public abstract void delete(Integer id);
}
