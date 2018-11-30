/**
 * Compilation javac AnagramDetection.java
 * Execution java com.bridgelabz.Algorithm.AnagramDetection
 * Purpose: Finding Anagram Between Two String's
 * @author-Himanshu Prajapati
 * @version-1.0.0
 * @since-12/11/18
 */

package com.javaprog.algorithm;

import com.javaprog.Utilities.*;
public class AnagramDetection
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Utility input=new Utility();
		String first=input.getLine();
		String second=input.getLine();
		boolean flag=Utility.anagram(first,second);
		if(flag)
			System.out.println("String's Are Anagram");
		else
			System.out.println("String's Are Not Anagram");	
	}

}
