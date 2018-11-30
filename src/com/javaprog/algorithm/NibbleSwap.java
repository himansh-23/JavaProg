/**
 * Compilation javac NibbleSwap.java
 * Execution java com.bridgelabz.Algorithm.NibbleSwap
 * Purpose: Finding Binary Of Any Number
 * @author-Himanshu Prajapati
 * @version-1.0.0
 * @since-13/11/18
 */
package com.javaprog.algorithm;

import com.javaprog.Utilities.*;
public class NibbleSwap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Utility input=new Utility();
		int Number=input.getInt();
		Number=Utility.nibbleSwap(Number);
		System.out.println("Result Is"+Number);
	}

}
