package com.kulikuliner.data.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "provinsi")
public class Provinsi {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String provinsi;
}
