package com.example.Allbrands.modelos;

import jakarta.persistence.*;

@Entity
@Table(name="tipoPrenda")
public class TipoPrenda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
}
