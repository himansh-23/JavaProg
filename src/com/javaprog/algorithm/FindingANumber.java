/**
 * Compilation javac FindingANumber.java
 * Execution com.bridgelabz.Algorithm.FindingANumber
 * Purpose: Finding A Number Using Binary Search By Asking Whether Number Is In Given Range Or Not
 * @author-Himanshu Prajapati
 * @version-1.0.0
 * @since-12/11/18
 */
package com.javaprog.algorithm;

import com.javaprog.Utilities.*;
public class FindingANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int Range=Integer.parseInt(args[0]);
		System.out.println("Choose Number Between 0 to "+(Range-1));
		int result=Utility.findNumber(Range);
		System.out.println("Your Number is "+result);
	}

}
