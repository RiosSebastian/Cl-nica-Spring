package com.example.HospitalConSpring.entity;

import jakarta.persistence.*;

@Entity
@Table(name="doctor")
public class Doctores {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String apellido;
    private String dni;
    private String especialidad;
    private String email;
    private String contraseña;
    private int telefono;

    public Doctores(String nombre, String apellido, String dni, String especialidad, String email, String contraseña, int telefono) {
    }

    public Doctores(Long id, String nombre, String apellido, String dni, String especialidad, String email, String contraseña, int telefono) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.especialidad = especialidad;
        this.email = email;
        this.contraseña = contraseña;
        this.telefono = telefono;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Doctores{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", dni='" + dni + '\'' +
                ", especialidad='" + especialidad + '\'' +
                ", email='" + email + '\'' +
                ", contraseña='" + contraseña + '\'' +
                ", telefono=" + telefono +
                '}';
    }
}
