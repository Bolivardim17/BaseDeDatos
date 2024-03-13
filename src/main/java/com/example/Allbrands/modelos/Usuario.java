package com.example.Allbrands.modelos;

import jakarta.persistence.*;

@Entity
@Table(name="usuarios")

public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombres;
    private String apellidos;
    private String cedula;
    private String correo;
    private Integer telefono;
    private String direccion;
    private String sexo;
    private String medioDePago;
    private String pais;
    private String departamento;
    private String municipio;
    private Integer codigoPostal;


}
