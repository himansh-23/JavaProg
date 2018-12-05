/**
 * Compilation javac LazyInitialization.java
 * Execution java com.javaprog.creational.LazyInitialization
 * Purpose: For Creating A Single Object of a class using Lazy Initialization method
 * @author-Himanshu Prajapati
 * @version-1.0.0
 * @since-5/12/18
*/

package com.javaprog.creational;

public class ThreadSafeInitialization {
	
	private static ThreadSafeInitialization obj;
	
	private ThreadSafeInitialization () {}
	
	public static synchronized ThreadSafeInitialization getInstance()
	{
		if(obj==null)
		{
			obj=new ThreadSafeInitialization();
		}
		return obj;
	
	}
	
	//To Increase performance because of cost associated with the synchronized method
	//We Cant use  double checked locking principle.
	
	/*public static ThreadSafeInitialization getInstance()
	{
		if(obj==null)
		{
			synchronized (ThreadSafeInitialization.class)
			{
				if(obj==null)
				{
					obj=new ThreadSafeInitialization();
				}
			}
		}
		return obj;
	}*/

}
