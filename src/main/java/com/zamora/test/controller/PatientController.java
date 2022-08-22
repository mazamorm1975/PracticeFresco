package com.zamora.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zamora.test.modelo.Patient;
import com.zamora.test.servicios.PatientService;

@RestController
@RequestMapping("/module2")
public class PatientController {

	@Autowired
	private PatientService patientservice;

	@PostMapping("/register")
	public ResponseEntity<String> register(@RequestBody Patient p) {

		try {

			patientservice.insertarRegistro(p);

		} catch (Exception ex) {

			return ResponseEntity.status(400).body("Password or username policy failed");
		}

		return ResponseEntity.status(200).body("Registration Succesfull");
	}

	@GetMapping("/testMessage")
	public String mensaje() {
		return "Hi rajes, if you can see this message. You got success";
	}
}
