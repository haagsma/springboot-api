package com.springlearn.boot.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;


@Data
@Entity
public class Grupo implements Serializable {

    /**
     * id int PRIMARY KEY AUTO_INCREMENT,
     * 	nemotecnico varchar(40) not null,
     * 	descricao varchar(255) null
     */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nemotecnico;

    private String descricao;
}
