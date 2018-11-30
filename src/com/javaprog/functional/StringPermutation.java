/**
 * Compilation javac StringPermutation.java
 * Execution java com.javaprog.StringPermutation
 * Purpose: For Finding All String Permutation's
 * @author-Himanshu Prajapati
 * @version-1.0.0
 * @since-10/11/18
 */
package com.javaprog.functional;

import com.javaprog.Utilities.*;
public class StringPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Utility input=new Utility();
		String s=input.getString();
		Utility.permutation(s,0,s.length()-1);	
	}
	


}
