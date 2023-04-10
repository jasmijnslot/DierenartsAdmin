package com.example.dierenartsadmin;

import jakarta.persistence.*;

@Entity
@Table(name = "Medicatie")
public class Medicatie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "naam")
    private String naam;

    @Column(name = "dosering")
    private String dosering;

    @Column(name = "opmerking")
    private String opmerking;
}
