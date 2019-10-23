package com.springlearn.boot.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name = "escolta_hist")
public class EscoltaHist implements Serializable {

    /**
     * id int not null AUTO_INCREMENT,
     * 	escolta int not null,
     * 	cliente int not null,
     * 	date_from timestamp default current_timestamp,
     * 	date_to timestamp null,
     */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "escolta")
    private Usuario escolta;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cliente")
    private Usuario cliente;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "origin")
    private EscoltaHistType origin;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "destiny")
    private EscoltaHistType destiny;
    private Date dateFrom;
    private Date dateTo;

}
