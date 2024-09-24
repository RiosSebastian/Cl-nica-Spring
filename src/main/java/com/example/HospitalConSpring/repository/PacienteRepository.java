package com.example.HospitalConSpring.repository;

import com.example.HospitalConSpring.entity.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PacienteRepository extends JpaRepository<Paciente, Long> {

    Optional<Paciente>findById (long id);
    List<Paciente> findBynombre(String nombre);

    List<Paciente>findByapellido(String apellido);

    List<Paciente>findBydni (String dni);

    List<Paciente> findByemail (String email);
}
