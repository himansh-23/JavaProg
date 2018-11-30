/**
 * Compilation javac Factors.java
 * Execution java com.javaprog.Functional.Factors
 * Purpose: For Finding Prime Factors of A Number .
 * @author-Himanshu Prajapati
 * @version-1.0.0
 * @since-10/11/18
 */

package com.javaprog.functional;

import com.javaprog.Utilities.*;
public class Factors {
	public static void main(String args[])
	{
		Utility input=new Utility();
		int N=input.getInt();
		Utility.primeFactors(N);
	}

}
