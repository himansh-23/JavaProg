/**
 * Compilation javac LazyInitialization.java
 * Execution java com.javaprog.creational.LazyInitialization
 * Purpose: For Creating A Single Object of a class using Lazy Initialization method
 * @author-Himanshu Prajapati
 * @version-1.0.0
 * @since-5/12/18
*/
package com.javaprog.creational;

public class LazyInitialization {
	
	private  static LazyInitialization obj;
	
	private LazyInitialization() {}
	
	public static LazyInitialization getInstance()
	{
		if(obj==null)
		{
			obj=new LazyInitialization();
		}
		return obj;
	}
}
