/**
 * Compilation javac Gambler.java
 * Execution java com.javaprog.Gambler
 * Purpose: For Finding PrimeFactorization Of a Number
 * @author-Himanshu Prajapati
 * @version-1.0.0
 * @since-10/11/18
 */
package com.javaprog.functional;

import com.javaprog.Utilities.*;
public class Gambler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Utility input=new Utility();
		System.out.println("Enter Stack Value");
		int Stack=input.getInt();
		System.out.println("Enter Goal Value");
		int Goal=input.getInt();
		System.out.println("Enter Number Of Times");
		int N=input.getInt();
		Utility.gambler(Stack, Goal, N);
		
	}

}
