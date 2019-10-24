package com.springlearn.boot.services;

import com.springlearn.boot.model.Empresa;
import com.springlearn.boot.repository.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Service
public class EmpresaService {

    @Autowired
    private EmpresaRepository empresaRepository;

    @PersistenceContext
    private EntityManager em;

    public List<Empresa> findAll() {
        return em.createNamedQuery("Empresa.findAll", Empresa.class).getResultList();
    }
}
