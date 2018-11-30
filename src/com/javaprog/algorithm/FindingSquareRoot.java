/**
 * Compilation javac MonthlyPayment.java
 * Execution com.bridgelabz.Algorithm.MonthlyPayment
 * Purpose: Finding Square Root A Number;  
 * @author-Himanshu Prajapati
 * @version-1.0.0
 * @since-13/11/18
 */
package com.javaprog.algorithm;

import com.javaprog.Utilities.*;
public class FindingSquareRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Utility input=new Utility();
		System.out.println("Enter A Number");
		double Number=input.getDouble();
		System.out.println(Utility.SquareRoot(Number));		
	}

}
