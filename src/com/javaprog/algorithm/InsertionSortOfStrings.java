/**
 * Compilation javac InsertionSortOfStrings.java
 * Execution com.bridgelabz.Algorithm.InsertionSortOfStrings
 * Purpose: Sorting The String Array
 * @author-Himanshu Prajapati
 * @version-1.0.0
 * @since-12/11/18
 */

package com.javaprog.algorithm;

import com.javaprog.Utilities.*;
public class InsertionSortOfStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Utility input=new Utility();
		System.out.println("Enter No of Strings");
		int Number=input.getInt();
		String stringarray[]=new String[Number];
		for(int i=0;i<stringarray.length;i++)
		{
			stringarray[i]=input.getString();
		}
		
		Utility.insertionSortString(stringarray);
		for(int start=0;start<stringarray.length;start++)
		{
			System.out.println(stringarray[start]);
		}
		
		
	}

}
