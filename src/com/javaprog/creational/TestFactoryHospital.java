package com.javaprog.creational;

public class TestFactoryHospital {

	public static void main(String[] args) 
	{
		Hospital first=HospitalFactory.getDetails("Doctor", "Himanshu", "9462963657");
		Hospital second=HospitalFactory.getDetails("Patient", "Kanishk", "9079795475");
		System.out.println("Doctor");
		System.out.println(first);
		System.out.println("Patient");
		System.out.println(second);
		
	}

}
