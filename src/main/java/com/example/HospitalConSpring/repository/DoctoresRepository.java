package com.example.HospitalConSpring.repository;

import com.example.HospitalConSpring.entity.Doctores;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DoctoresRepository extends JpaRepository<Doctores, Long> {
    Optional<Doctores> findAll(String especialidad);
}
