/**
 * Compilation javac PrimeCheck.java
 * Execution java com.bridgelabz.Algorithm.PrimeCheck
 * Purpose: Finding Prime Number Between 0 To N
 * @author-Himanshu Prajapati
 * @version-1.0.0
 * @since-12/11/18
 */

package com.javaprog.algorithm;

import com.javaprog.Utilities.*;
import java.util.Vector;
public class PrimeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter Number Between 0 to 1000");
		Utility input=new Utility();
		int n=input.getInt();
		Vector <Integer> v1=Utility.primeCount(n);
		System.out.println(v1);
	}

}
