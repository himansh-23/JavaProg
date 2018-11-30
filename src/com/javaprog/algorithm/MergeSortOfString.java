/**
 * Compilation javac MergeSortOfString.java
 * Execution com.bridgelabz.Algorithm.MergeSortOfString
 * Purpose: Sorting The String Array Using MergeSort
 * @author-Himanshu Prajapati
 * @version-1.0.0
 * @since-13/11/18
 */
package com.javaprog.algorithm;

import com.javaprog.Utilities.*;
public class MergeSortOfString {

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
		Utility.mergeSortOfString(stringarray,0,stringarray.length-1);
		
		for(int start=0;start<stringarray.length;start++)
		{
			System.out.println(stringarray[start]);
		}
	}

}
