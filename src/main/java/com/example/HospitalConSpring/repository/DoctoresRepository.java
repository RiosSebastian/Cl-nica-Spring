package com.example.HospitalConSpring.repository;

import com.example.HospitalConSpring.entity.Doctores;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface DoctoresRepository extends JpaRepository<Doctores, Long> {
    Optional<Doctores> findAll(String especialidad);
}
