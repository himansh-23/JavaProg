package com.javaprog.oops.clinical.applications;

import java.util.List;

import com.javaprog.oops.clinical.models.Appointment;
import com.javaprog.oops.clinical.models.Doctor;
import com.javaprog.oops.clinical.models.Patients;

public interface DocotorPatientEntries {

	public void operation(List<Patients> personlist,List<Doctor> doctorlist, List<Appointment> appointmentlist);
	List<Patients> addPatient();
	List<Patients> editPatient(List<Patients> patientlist);
	List<Doctor> deleteDoctor(List<Doctor> list);
	List<Doctor> addDoctor();
	List<Doctor> editDoctor();
	List<Doctor> deleteDoctor();
	void savePatients(List<Patients> patientlist);
	void saveDoctor(List<Doctor> doctorlist);
	void fixAppointment(Doctor d,Patients p);
	
}
