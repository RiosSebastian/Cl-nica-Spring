package com.example.HospitalConSpring.entity;

import jakarta.persistence.*;

@Entity
@Table(name= "medicamentos")
public class Medicamentos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo;
    private String nombre;
    private String cantidad;
    private String nombre_distri;
    private String nombre_receptor;
    private String id_del_receptor;

    public Medicamentos() {
    }

    public Medicamentos(long codigo, String nombre, String cantidad, String nombre_distri, String nombre_receptor, String id_del_receptor) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.nombre_distri = nombre_distri;
        this.nombre_receptor = nombre_receptor;
        this.id_del_receptor = id_del_receptor;
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getNombre_distri() {
        return nombre_distri;
    }

    public void setNombre_distri(String nombre_distri) {
        this.nombre_distri = nombre_distri;
    }

    public String getNombre_receptor() {
        return nombre_receptor;
    }

    public void setNombre_receptor(String nombre_receptor) {
        this.nombre_receptor = nombre_receptor;
    }

    public String getId_del_receptor() {
        return id_del_receptor;
    }

    public void setId_del_receptor(String id_del_receptor) {
        this.id_del_receptor = id_del_receptor;
    }
}
