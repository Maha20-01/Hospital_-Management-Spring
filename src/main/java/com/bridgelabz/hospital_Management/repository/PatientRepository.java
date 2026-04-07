package com.bridgelabz.hospital_Management.repository;

import com.bridgelabz.hospital_Management.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {
}