package com.javaprog.creational;

public class Patient extends Hospital {

	private String name;
	private String phone;
	
	public Patient(String name,String phone)
	{
		this.name=name;
		this.phone=phone;
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

	@Override
	public String getPhone() {
		// TODO Auto-generated method stub
		return this.phone;
	}

}
