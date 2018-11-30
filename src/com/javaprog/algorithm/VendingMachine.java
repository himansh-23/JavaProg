/**
 * Compilation javac VendingMachine.java
 * Execution com.bridgelabz.Algorithm.VendingMachine
 * Purpose: Finding Minimun Number Of Notes Required To Form That Price.
 * @author-Himanshu Prajapati
 * @version-1.0.0
 * @since-13/11/18
 */
package com.javaprog.algorithm;

import com.javaprog.Utilities.*;
public class VendingMachine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Utility input=new Utility();
		System.out.println("Enter Price");
		int Price=input.getInt();
		Utility.minCoinCounter(Price);
	}

}
