package com.javaprog.oops.clinical.applications;

import com.javaprog.Utilities.Utility;

public class ClinicalStart {

	public static void main(String[] args) {
		
		System.out.println("WELCOME TO CLINICAL MANAGEMENT");
		//System.out.println();
		Utility input=new Utility();
		int Answer=0;
		
		do {
			System.out.println("1. Adding Doctor or Patient or Appointment");
			System.out.println("2. Search");
			System.out.println("3. Display");
			System.out.println("4. Close");
			Answer=input.getInt();
			switch(Answer)
			{
			case 1:
				new DoctorPatientImplementation().operation();
				break;
			case 2:
				new SearchingImplementation().operation();
				break;
			case 3:
				new InformationDisplayImplementation().operation();
				break;
			case 4:
				System.out.println("Exiting");
				break;
			default:
				System.out.println("Invalid Entry");
			}
		}while(Answer!=4);

	}

}
