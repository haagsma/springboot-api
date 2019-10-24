package com.springlearn.boot.controller;

import com.springlearn.boot.model.Empresa;
import com.springlearn.boot.services.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/empresa")
public class EmpresaController {

    @Autowired
    private EmpresaService empresaService;

    @GetMapping("/list")
    @Transactional
    private ResponseEntity<?> findAll() {
        List<Empresa> empresas = empresaService.findAll();
        return new ResponseEntity<>(empresas, HttpStatus.OK);
    }


    @GetMapping("/list2")
    @javax.transaction.Transactional
    private ResponseEntity<?> findAll2() {
        List<Empresa> empresas = empresaService.findAll();
        return new ResponseEntity<>(empresas, HttpStatus.OK);
    }
}
