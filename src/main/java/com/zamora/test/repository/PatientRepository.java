package com.zamora.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zamora.test.modelo.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient, String> {

}
