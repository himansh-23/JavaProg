package com.javaprog.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

@Inherited
@Target(ElementType.METHOD)
@interface MyAnnotation4 {
int myvalue1()default 2;
}

class Checking1x 
{
	@MyAnnotation4(myvalue1=89)
	public void m1()
	{
		System.out.println("zzz");
	}	
	
}

class Checking2x extends Checking1x
{
	
}

class TestChecking2x{
	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		
		Checking1x x=new Checking1x();
		Method m=x.getClass().getMethod("m1");
		
		Method[]m1=java.lang.String.class.getMethods();
		for(int i=0;i<m1.length;i++)
		System.out.println(m1[i]);
//		MyAnnotation4 temp=m.getAnnotation(MyAnnotation4.class);
//		System.out.println(temp.myvalue1());
		
	}
}