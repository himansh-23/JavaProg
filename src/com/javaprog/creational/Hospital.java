/**
 * Compilation javac Hospital.java
 * Purpose: For Providing loose coupling to its child-classes 
 * @author-Himanshu Prajapati
 * @version-1.0.0
 * @since-6/12/18
*/

package com.javaprog.creational;

public abstract class Hospital {
		
	public abstract String getName();
	public abstract String getPhone();
	
	@Override
	public String toString()
	{
		return "Name "+this.getName()+"  Phone "+this.getPhone();
	}
}
