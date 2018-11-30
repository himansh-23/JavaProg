/**
 * Compilation javac MonthlyPayment.java
 * Execution com.bridgelabz.Algorithm.MonthlyPayment
 * Purpose: Finding Compound Interest For Principle Amound Which Compunded Monthly.  
 * @author-Himanshu Prajapati
 * @version-1.0.0
 * @since-13/11/18
 */
package com.javaprog.algorithm;

import com.javaprog.Utilities.*;
public class MonthlyPayment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int Payment=Integer.parseInt(args[0]);
		double Year=Double.parseDouble(args[1]);
		int Rate=Integer.parseInt(args[2]);
		
		double value=Utility.monthlyPayment(Payment,Year,Rate);
		System.out.println(value);
	}

}
