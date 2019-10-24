package com.springlearn.boot.repository;

import com.springlearn.boot.model.Veiculo;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface VeiculoRepository extends PagingAndSortingRepository<Veiculo, Integer> {
}
