package com.javaprog.annotation;

public class DriverClassSingle {

	public static void main(String[] args) {

		check();
	}
	
	@MyAnnotation1(value=3)
	public static void check()
	{
		System.out.println("Dl");
		
	}

}
