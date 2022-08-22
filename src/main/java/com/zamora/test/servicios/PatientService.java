package com.zamora.test.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zamora.test.modelo.Patient;
import com.zamora.test.repository.PatientRepository;

@Service
public class PatientService {

	@Autowired
	private PatientRepository patientrepo;
	
	public void insertarRegistro(Patient p) {
		if(p == null) {
			
			throw new IllegalArgumentException();
		
		}else {
			
			p.setPatient_Id(p.getPatient_Id());
			p.setPatient_name(p.getPatient_name());
			p.setPatient_email(p.getPatient_email());
			p.setPatient_mobile(p.getPatient_mobile());
			p.setRegisteredDate(p.getRegisteredDate());
		
			patientrepo.save(p);
		}
	}
	
	
}
