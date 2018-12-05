package com.javaprog.oops.clinical.applications;

import java.util.List;

import com.javaprog.oops.clinical.models.Appointment;
import com.javaprog.oops.clinical.models.Doctor;
import com.javaprog.oops.clinical.models.Patients;

public interface DocotorPatientEntries {

	public void operation();
	void addPatient();
	void editPatient();
	void deletePatient();
	void addDoctor();
	void editDoctor();
	void deleteDoctor();
	void save();
	void fixAppointment();
	
}
