package com.javaprog.oops.clinical.models;

public class Doctor {
	int id;
	String name;
	String availability;
	String specialization;
	
	public Doctor() {
		
	}
	
	public Doctor(int id,String name,String availability,String specialization)
	{
		this.id=id;
		this.name=name;
		this.availability=availability;
		this.specialization=specialization;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAvailability() {
		return availability;
	}
	public void setAvailability(String availability) {
		this.availability = availability;
	}
	
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
}
