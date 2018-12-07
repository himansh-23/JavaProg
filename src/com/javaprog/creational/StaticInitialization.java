/**
 * Compilation javac EagerInitialization.java
 * Execution java com.javaprog.creational.EagerInitialization
 * Purpose: For Creating A Single Object of a class using Static Block method
 * @author-Himanshu Prajapati
 * @version-1.0.0
 * @since-5/12/18
*/
package com.javaprog.creational;

public class StaticInitialization {
	
	private static final StaticInitialization obj;
	
	static 
	{
		try {
		obj=new StaticInitialization();
		}
		catch(Exception e)
		{
			throw new RuntimeException("Instance Not Created");

		}
	}
	private StaticInitialization()
	{
		
	}
	
	public static StaticInitialization getInstance()
	{
		return obj;
	}
}

class MainStaticInitialization
{
	public static void main(String args[]) {
		StaticInitialization x=StaticInitialization.getInstance();
		StaticInitialization y=StaticInitialization.getInstance();
		System.out.println(x.hashCode());
		System.out.println(y.hashCode());
		
	}
}

