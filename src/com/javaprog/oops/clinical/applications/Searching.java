package com.javaprog.oops.clinical.applications;

import java.util.List;

import com.javaprog.oops.clinical.models.Doctor;
import com.javaprog.oops.clinical.models.Patients;

public interface Searching {
	
	void operation();
	void searchByPatientName();
	void serarchByPatientid();
	void searchByPatientphone();
	
	void searchByDoctorName();
	void searchByDoctorId();
	void searchByDoctorSpecialization();
	void searchByDoctorAvailability();
	void mostPopularDoctor();
	void mostPopularSpecialization();
	
}
