package com.springlearn.boot.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@EqualsAndHashCode
@Entity
@NamedQueries({
        @NamedQuery(name = "Empresa.findAll", query = "SELECT e FROM Empresa e")
})
public class Empresa implements Serializable {

    /**
     * id	int(11)
     * razao_social	varchar(255)
     * nome_fantasia	varchar(255)
     * cnpj	varchar(18)
     * representante	varchar(100)
     * email_representante	varchar(255)
     * telefone_contato	varchar(100)
     * status	int(11)
     * created_at	timestamp
     * updated_at	timestamp
     */

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "razao_social")
    private String razaoSocial;

    @Column(name = "nome_fantasia")
    private String nomeFantasia;
    private String cnpj;
    private String representante;

    @Column(name = "email_representante")
    private String emailRepresentante;

    @Column(name = "telefone_contato")
    private String telefoneContato;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "status")
    private Status status;

    @Column(name = "created_at")
    private Date createdAt;

    @Column(name = "updated_at")
    private Date updatedAt;

}
