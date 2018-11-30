/**
 * Compilation javac BubbleSortOfInteger.java
 * Execution com.bridgelabz.Algorithm.BubbleSortOfInteger
 * Purpose: Sorting The Integer Array Using Bubble Sort
 * @author-Himanshu Prajapati
 * @version-1.0.0
 * @since-12/11/18
 */

package com.javaprog.algorithm;

import com.javaprog.Utilities.*;
public class BubbleSortOfInteger {
	public static void main(String args[])
	{
		Utility input=new Utility();
		System.out.println("Enter Size Of Array");
		int Number=input.getInt();
		int IntegerArray[]=new int[Number];
		for(int start=0;start<Number;start++)
		{
			IntegerArray[start]=input.getInt();
		}
		Utility.bubbleSortInt(IntegerArray);
		for(int start=0;start<Number;start++)
		{
			System.out.print(IntegerArray[start]+" ");
		}
	}

}
