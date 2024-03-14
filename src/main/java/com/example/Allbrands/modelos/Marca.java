package com.example.Allbrands.modelos;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name="marcas")
public class Marca {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    private LocalDate anoDeCreacion;
    private String sedePrincipal;

    public Marca() {
    }

    public Marca(Integer id, String nombre, LocalDate anoDeCreacion, String sedePrincipal) {
        this.id = id;
        this.nombre = nombre;
        this.anoDeCreacion = anoDeCreacion;
        this.sedePrincipal = sedePrincipal;
    }
}
