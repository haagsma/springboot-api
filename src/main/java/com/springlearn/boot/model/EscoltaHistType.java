package com.springlearn.boot.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "escolta_hist_type")
public class EscoltaHistType implements Serializable {

    /**
     * id int not null AUTO_INCREMENT,
     * 	local varchar(255) not null,
     * 	type varchar(20) not null,
     */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String place;
    private String type;
}
