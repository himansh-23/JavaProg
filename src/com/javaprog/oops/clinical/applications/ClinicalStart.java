package com.javaprog.oops.clinical.applications;

import com.javaprog.Utilities.Utility;

public class ClinicalStart {

	public static void main(String[] args) {
		
		System.out.println("WELCOME TO CLINICAL MANAGEMENT");
		Utility input=new Utility();
		int Answer=0;
		
		do {
			System.out.println("1. Adding Doctor or Patient");
			System.out.println("2. Search");
			System.out.println("3. Display");
			System.out.println("4. Close");
			Answer=input.getInt();
			switch(Answer)
			{
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				System.out.println("Exiting");
				break;
			default:
				System.out.println("Invalid Entry");
			}
		}while(true);

	}

}
