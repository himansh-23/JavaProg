/**
 * Compilation javac TemperatureConversion.java
 * Execution com.bridgelabz.Algorithm.TemperatureConversion
 * Purpose: Convert Temperature From Fahrenheit To Celsius And Celsius To Fahrenheit  
 * @author-Himanshu Prajapati
 * @version-1.0.0
 * @since-13/11/18
 */
package com.javaprog.algorithm;

import com.javaprog.Utilities.*;
public class TemperatureConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Utility input=new Utility();
		System.out.println("ENTER 1 TO ENTER Temperature in Fahrenheit");
		System.out.println("ENTER 2 TO ENTER Temperature in Celsius");
		int result=input.getInt();
		System.out.println("ENTER Temperature ");
		int temperature=input.getInt();
		if(result==1)
		{
			System.out.println("Temp in Celsius"+Utility.temperatureConversion(temperature,false));
		}
		else
		{
			System.out.println("Temp in Fahrenheit"+Utility.temperatureConversion(temperature,true));
		}
	}

}
