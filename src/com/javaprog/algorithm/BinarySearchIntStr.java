/**
 * Compilation javac BinarySearchIntStr.java
 * Execution java com.bridgelabz.Algorithm.BinarySearchIntStr
 * Purpose: Sorting Of String And IntegerArray
 * @author-Himanshu Prajapati
 * @version-1.0.0
 * @since-12/11/18
 */

package com.javaprog.algorithm;

import com.javaprog.Utilities.*;
public class BinarySearchIntStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	Utility input=new Utility();
		
		String s[]= {"abc","ldi","bcd"};
		String search="ldi";
		long start=System.nanoTime();
		Utility.binarySearchString(s, search);
		long end=System.nanoTime();
		int arr[]= {9,1,7,3,2,4,6,5,8};
		int search1=5;
		Utility.binarySearchInteger(arr, search1);
		
		
	}

}
