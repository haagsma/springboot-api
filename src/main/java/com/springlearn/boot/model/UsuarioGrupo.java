package com.springlearn.boot.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "usuario_grupo")
public class UsuarioGrupo implements Serializable {

    /**
     * usuario int not null,
     * 	grupo int not null,
     */

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "usuario")
    private Usuario usuario;

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "grupo")
    private Grupo grupo;
}
