/**
 * Compilation javac InsertionSortIntStr.java
 * Execution com.bridgelabz.Algorithm.InsertionSortIntStr;
 * Purpose: Insertion Sort for Integer Array and String and Calculation Time Elapsed For this Sorting
 * @author-Himanshu Prajapati
 * @version-1.0.0
 * @since-12/11/18
 */
package com.javaprog.algorithm;

import com.javaprog.Utilities.*;
public class InsertionSortIntStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {9,1,7,3,2,4,6,5,8};
		long start=System.nanoTime();
		Utility.insertionSortInt(arr);
		long end=System.nanoTime();
		System.out.println();
		System.out.println((end-start)/1000+"  microSeconds");
		
		String s[]= {"abc","abd","abe"};
		start=System.nanoTime();
		Utility.insertionSortString(s);
		end=System.nanoTime();
		
		for(int i=0;i<s.length;i++)
		System.out.println(s[i]);
		
		System.out.println();
		System.out.println((end-start)/1000+"  microSeconds");
		
	}

}
