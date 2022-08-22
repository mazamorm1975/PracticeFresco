package com.zamora.test.modelo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
public class Patient {

	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="patient_Id", nullable = false)
	private String patient_Id;
		
	//@Column(name="patient_email")
	private String patient_email;
	
	//@Column(name="patient_mobile")
	private String patient_mobile;
	
	//@Column(name="patient_name")
	private String patient_name;
		
	//@Column(name="registeredDate")
	private Date registeredDate;

	public Patient() {

		super();
	}

	public Patient(String patient_Id, String patient_name, String patient_email, String patient_mobile,
			Date registeredDate) {
		super();
		this.patient_Id = patient_Id;
		this.patient_name = patient_name;
		this.patient_email = patient_email;
		this.patient_mobile = patient_mobile;
		this.registeredDate = registeredDate;
	}

	public String getPatient_Id() {
		return patient_Id;
	}

	public void setPatient_Id(String patient_Id) {
		this.patient_Id = patient_Id;
	}

	public String getPatient_name() {
		return patient_name;
	}

	public void setPatient_name(String patient_name) {
		this.patient_name = patient_name;
	}

	public String getPatient_email() {
		return patient_email;
	}

	public void setPatient_email(String patient_email) {
		this.patient_email = patient_email;
	}

	public String getPatient_mobile() {
		return patient_mobile;
	}

	public void setPatient_mobile(String patient_mobile) {
		this.patient_mobile = patient_mobile;
	}

	public Date getRegisteredDate() {
		return registeredDate;
	}

	public void setRegisteredDate(Date registeredDate) {
		this.registeredDate = registeredDate;
	}
	
	

}
