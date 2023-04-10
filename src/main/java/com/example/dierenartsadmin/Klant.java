package com.example.dierenartsadmin;

import jakarta.persistence.*;

@Entity
@Table(name = "Klant")
public class Klant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "achterNaam")
    private String achterNaam;

    @Column(name = "telefoonNr")
    private int telefoonNr;

    @Column(name = "postcode")
    private String postcode;

    @Column(name = "email")
    private String email;





}
