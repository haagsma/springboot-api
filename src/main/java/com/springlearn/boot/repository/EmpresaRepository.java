package com.springlearn.boot.repository;

import com.springlearn.boot.model.Empresa;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface EmpresaRepository extends PagingAndSortingRepository<Empresa, Integer> {
}
