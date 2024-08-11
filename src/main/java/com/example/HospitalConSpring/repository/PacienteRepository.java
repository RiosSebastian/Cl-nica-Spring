package com.example.HospitalConSpring.repository;

import com.example.HospitalConSpring.entity.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PacienteRepository extends JpaRepository<Paciente, Long> {
}
