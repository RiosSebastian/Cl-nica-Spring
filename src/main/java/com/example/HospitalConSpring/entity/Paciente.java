package com.example.HospitalConSpring.entity;

import jakarta.persistence.*;

@Entity
@Table(name= "paciente")
public class Paciente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String apellido;
    private String dni;
    private String obrasocial;
    private String email;
    private String domicilio;
    private int edad;

    public Paciente() {
    }

    public Paciente(Long id, String nombre, String apellido, String dni, String obrasocial, String email, String domicilio, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.obrasocial = obrasocial;
        this.email = email;
        this.domicilio = domicilio;
        this.edad = edad;
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

    public String getObrasocial() {
        return obrasocial;
    }

    public void setObrasocial(String obrasocial) {
        this.obrasocial = obrasocial;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", dni='" + dni + '\'' +
                ", obrasocial='" + obrasocial + '\'' +
                ", email='" + email + '\'' +
                ", domicilio='" + domicilio + '\'' +
                ", edad=" + edad +
                '}';
    }
}
