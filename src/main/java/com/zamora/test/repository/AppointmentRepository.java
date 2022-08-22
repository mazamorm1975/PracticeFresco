package com.zamora.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zamora.test.modelo.Appointment;

public interface AppointmentRepository extends JpaRepository<Appointment, String> {

}
