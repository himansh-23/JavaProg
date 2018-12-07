package com.javaprog.annotation;

import java.lang.reflect.Method;

@MyAnnotation2
public class DriverClassMulti {
	
	
	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		Method x=new DriverClassMulti().getClass().getMethod("hello");
		
		MyAnnotation2 m=x.getAnnotation(MyAnnotation2.class);
		System.out.println(m.value1());
		System.out.println(m.value2());
		System.out.println(m.value3());
	}
	@MyAnnotation2
	public void hello()
	{
		System.out.println("Think");
	}

}
