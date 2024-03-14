package com.example.Allbrands.modelos;

import jakarta.persistence.*;

@Entity
@Table(name = "producto")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    private String referencia;
    private Integer cantidadBodega;
    private  Integer precioUnitario;
    private String descripcion;
    private String fotografia;
    private String talla;

    public Producto() {
    }

    public Producto(Integer id, String nombre, String referencia, Integer cantidadBodega, Integer precioUnitario, String descripcion, String fotografia, String talla) {
        this.id = id;
        this.nombre = nombre;
        this.referencia = referencia;
        this.cantidadBodega = cantidadBodega;
        this.precioUnitario = precioUnitario;
        this.descripcion = descripcion;
        this.fotografia = fotografia;
        this.talla = talla;
    }
}
