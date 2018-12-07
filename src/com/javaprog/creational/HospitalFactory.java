package com.javaprog.creational;

public class HospitalFactory {

	public static Hospital getDetails(String type,String name,String phone)
	{
		if(type.equalsIgnoreCase("Doctor"))
		{
			return new Doctor(name,phone);
		}
		else if(type.equalsIgnoreCase("Patient"))
		{
			return new Patient(name,phone);
		}
		return null;
	}
}
