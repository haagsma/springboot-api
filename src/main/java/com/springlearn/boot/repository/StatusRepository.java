package com.springlearn.boot.repository;

import com.springlearn.boot.model.Status;
import com.springlearn.boot.model.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatusRepository extends CrudRepository<Status, Integer> {
}
