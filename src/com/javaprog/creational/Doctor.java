package com.javaprog.creational;

public class Doctor extends Hospital {

	private String name;
	private String phone;
	
	
	public Doctor(String name,String phone)
	{
		this.name=name;
		this.phone=phone;
	}
	@Override
	public String getName() {
		
		return this.name;
	}

	@Override
	public String getPhone() {
		
		return this.phone;
	}

}
