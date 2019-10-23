package com.springlearn.boot.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
public class Veiculo implements Serializable {

    /**
     * id int not null AUTO_INCREMENT,
     * 	marca varchar(100) null,
     * 	modelo varchar(100) null,
     * 	cor varchar(20) null,
     * 	placa varchar(10) null,
     * 	ano_fabricacao varchar(4) not null,
     * 	ano_modelo varchar(4) null,
     * 	renavam varchar(255) null,
     * 	usuario int not null,
     * 	status int not null,
     * 	created_at timestamp DEFAULT current_timestamp,
     * 	updated_at timestamp default current_timestamp,
     */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String marca;
    private String modelo;
    private String cor;
    private String placa;

    @Column(name = "ano_fabricacao")
    private String anoFabricacao;

    @Column(name = "ano_modelo")
    private String anoModelo;
    private String renavam;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "usuario")
    private Usuario usuario;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "status")
    private Status status;

    @Column(name = "created_at")
    private Date createdAt;

    @Column(name = "updated_at")
    private Date updatedAt;
}
