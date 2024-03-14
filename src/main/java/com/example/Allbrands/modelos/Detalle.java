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

    public Detalle() {
    }

    public Detalle(Integer id, Integer costoTotal, Integer cantidadProductos) {
        this.id = id;
        this.costoTotal = costoTotal;
        this.cantidadProductos = cantidadProductos;
    }
}
