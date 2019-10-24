package com.springlearn.boot.repository;

import com.springlearn.boot.model.Grupo;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface GrupoRepository extends PagingAndSortingRepository<Grupo, Integer> {
}
