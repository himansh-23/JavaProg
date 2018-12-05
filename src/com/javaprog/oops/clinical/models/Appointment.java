package com.javaprog.oops.clinical.models;

public class Appointment {
	
	String doctorName;
	int doctorId;
	String patientName;
	int patientId;
	String date;
	String patientPhone;
	
	public Appointment() {
		// TODO Auto-generated constructor stub
	}
	
	public Appointment(String doctorName,int doctorId,String patientName,int patientId,String patientPhone,String date)
	{
		this.doctorName=doctorName;
		this.doctorId=doctorId;
		this.patientName=patientName;
		this.patientId=patientId;
		this.date=date;
		this.patientPhone=patientPhone;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public int getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	public String getPatientPhone() {
		return patientPhone;
	}
	public void setPatientPhone(String patientPhone) {
		this.patientPhone = patientPhone;
	}
	
}
