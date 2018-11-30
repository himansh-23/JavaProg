/**
 * Compilation javac SumOfIntegers.java
 * Execution java com.javaprog.SumOfIntegers
 * Purpose: For Finding Distinct Triple Who's Sum Is Zero
 * @author-Himanshu Prajapati
 * @version-1.0.0
 * @since-10/11/18
 */
package com.javaprog.functional;

import com.javaprog.Utilities.*;
public class SumOfIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Utility input=new Utility();
		int N=input.getInt();
		int []arr=new int[N];
		for(int i=0;i<N;i++)
		{
			arr[i]=input.getInt();
		}
		
		Utility.printNoOfTriple(arr);	
	}

}
