package com.springlearn.boot.repository;

import com.springlearn.boot.model.EscoltaHist;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface EscoltaHistRepository extends PagingAndSortingRepository<EscoltaHist, Integer> {
}
