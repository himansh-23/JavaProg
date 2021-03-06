/**
 * Compilation javac EagerInitialization.java
 * Execution java com.javaprog.creational.EagerInitialization
 * Purpose: For Creating A Single Object of a class using Eager method
 * @author-Himanshu Prajapati
 * @version-1.0.0
 * @since-5/12/18
*/
package com.javaprog.creational;

public class EagerInitialization {
	private static final EagerInitialization obj=new EagerInitialization();
	
	private EagerInitialization()
	{
		
	}
	
	public static EagerInitialization getInstance()
	{
		return obj;
	}

}

class MainEagerInitialization
{
	public static void main(String args[]) {
		EagerInitialization x=EagerInitialization.getInstance();
		EagerInitialization y=EagerInitialization.getInstance();
		System.out.println(x.hashCode());
		System.out.println(y.hashCode());
		
	}
}

