package com.zamora.test.modelo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
public class Appointment {

	@Id
	private String booking_id;
	private String disease;
	private Date tentavieDate;
	private String priority;
	private String patientId;
	private Date bookingTime;
	
	
	public Appointment( String disease, Date tentavieDate, String priority, String patientId) {
		super();
		
		this.disease = disease;
		this.tentavieDate = tentavieDate;
		this.priority = priority;
		this.patientId = patientId;
		
	}
	
	
}
