/**
 * Compilation javac AnagramPrimeCheck.java
 * Execution java com.bridgelabz.Algorithm.AnagramPrimeCheck
 * Purpose: Finding Prime Number Between 0 To N and Checking Those Number Who Are Anagram And Palindrome
 * @author-Himanshu Prajapati
 * @version-1.0.0
 * @since-12/11/18
 */

package com.javaprog.algorithm;

import com.javaprog.Utilities.*;
public class AnagramPrimeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Utility input=new Utility();
		System.out.println("Enter Range Between 0 to 1000 To Find Prime Anagram And Palindrome Number Between It");
		int n=input.getInt();
		Utility.anagramPrimeCheck(n);
	}

}
