package com.javaprog.oops.clinical.applications;

import java.util.List;

import com.javaprog.oops.clinical.models.Doctor;
import com.javaprog.oops.clinical.models.Patients;

public interface Searching {
	
	void searchByPatientName(List<Patients> patientlist);
	void serarchByPatientid(List<Patients> patientlist);
	void searchByPatientphone(List<Patients> patientlist);
	
	void searchByDoctorName(List<Doctor> doctorlist);
	void searchByDoctorId(List<Doctor> doctorlist);
	void searchByDoctorSpecialization(List<Doctor> doctorlist);
	void searchByDoctorAvailability(List<Doctor> doctorlist);
	void bookAppointment(Doctor details1,Patients details2);
	
}
