package com.example.Allbrands.modelos;

import jakarta.persistence.*;

@Entity
@Table(name="detalle")
public class Detalle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;
    private Integer costoTotal;
    private Integer cantidadProductos;
}
