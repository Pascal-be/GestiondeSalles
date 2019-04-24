package com.pascal.GestiondeSalles.Client;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "client")
public class ClientModel {

    @Id
    @GeneratedValue
    private Long id;
    private String name;

}