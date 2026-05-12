package com.example.spring_security.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

@Entity
@Data
public class JobModel {

    @Id
    @GeneratedValue
    private Long id;
    private String nome;
    private String endereco;



}
