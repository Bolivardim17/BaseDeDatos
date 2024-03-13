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


}
