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

    public Usuario() {
    }

    public Usuario(Integer id, String nombres, String apellidos, String cedula, String correo, Integer telefono, String direccion, String sexo, String medioDePago, String pais, String departamento, String municipio, Integer codigoPostal) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.cedula = cedula;
        this.correo = correo;
        this.telefono = telefono;
        this.direccion = direccion;
        this.sexo = sexo;
        this.medioDePago = medioDePago;
        this.pais = pais;
        this.departamento = departamento;
        this.municipio = municipio;
        this.codigoPostal = codigoPostal;
    }
}
