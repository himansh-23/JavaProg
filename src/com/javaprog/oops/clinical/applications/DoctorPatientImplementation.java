package com.javaprog.oops.clinical.applications;

import java.util.List;

import com.javaprog.Utilities.Utility;
import com.javaprog.oops.clinical.models.Appointment;
import com.javaprog.oops.clinical.models.Doctor;
import com.javaprog.oops.clinical.models.Patients;




public class DoctorPatientImplementation implements DocotorPatientEntries{
	
	Utility input=new Utility();
	public DoctorPatientImplementation()
	{
		
	}
	
	public void operation(List<Patients> personlist,List<Doctor> doctorlist, List<Appointment> appointmentlist)
	{
		int Answer=0;
		do {
			System.out.println("1. Add Doctor");	
			System.out.println("2. Edit Doctor");
			System.out.println("3. Delete Doctor");
			System.out.println("4. Save Doctors");
			System.out.println("5. Add Patients");
			System.out.println("6. Edit Patients");
			System.out.println("7. Delete Patients");
			System.out.println("8. Save Patients");
			System.out.println("9. Fix Appointment With Doctor For Patients");
			Answer=input.getInt();
		}while(true);
		
	}

}
