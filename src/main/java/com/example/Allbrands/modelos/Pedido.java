package com.example.Allbrands.modelos;

import jakarta.persistence.*;

@Entity
@Table(name="pedido")
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;
    private String nombre;

    public Pedido() {
    }

    public Pedido(Integer id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
}
