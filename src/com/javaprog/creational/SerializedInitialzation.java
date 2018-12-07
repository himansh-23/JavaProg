package com.javaprog.creational;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializedInitialzation implements Serializable {
	
	private static long serialVersionUID=-958462548526L;
	
	private SerializedInitialzation()
	{
		
	}
	
	private static class SingletonHelper
	{
		private static final SerializedInitialzation obj=new  SerializedInitialzation();
	}
	
	public static SerializedInitialzation getInstance()
	{
		return SingletonHelper.obj;
	}
	

	protected Object readResolve() 
	{
    return getInstance();
	}
}

class MainSerializedInitialzation
{
		public static void main(String[] args) throws Exception 
		{
			SerializedInitialzation instanceOne = SerializedInitialzation.getInstance();
	        ObjectOutput out = new ObjectOutputStream(new FileOutputStream("filename.ser"));
	        out.writeObject(instanceOne);
	        out.close();
	        
	        //deserailize from file to object
	        ObjectInput in = new ObjectInputStream(new FileInputStream(
	                "filename.ser"));
	        SerializedInitialzation instanceTwo = (SerializedInitialzation) in.readObject();
	        in.close();
	        System.out.println("Before Saving in File");
	        // hash code of both is same due to resolve method
	        System.out.println("instanceOne hashCode="+instanceOne.hashCode());
	        System.out.println("instanceTwo hashCode="+instanceTwo.hashCode());
	        
	        System.out.println("After Saving in File");
	        System.out.println("instanceOne hashCode="+instanceOne.hashCode());
	        System.out.println("instanceTwo hashCode="+instanceTwo.hashCode());
	        
		}
}