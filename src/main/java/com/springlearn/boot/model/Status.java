package com.springlearn.boot.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Status implements Serializable {

    /**
     * id	int(11)
     * nemotecnico	varchar(40)
     * descricao	varchar(255)
     * created_at	timestamp
     * updated_at	timestamp
     */

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String nemotecnico;

    @Column
    private String descricao;

    @Column(name = "created_at")
    private String createdAt;

    @Column(name = "updated_at")
    private String updatedAt;
}
