package com.example.dierenartsadmin;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "Dier")
public class Dier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "naam")
    private String naam;

    @Column(name = "geboortDatum")
    private Date geboorteDatum;

    @Column(name = "soort")
    private String soort;

}
