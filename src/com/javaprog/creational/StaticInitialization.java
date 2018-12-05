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
	
	public StaticInitialization getInstance()
	{
		return obj;
	}
}
