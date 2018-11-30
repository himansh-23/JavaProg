/**
 *
 * Compilation javac HarmonicNumber.java
 * Execution java com.javaprog.HarmonicNumber
 * Purpose: For Finding Nth Harmonic Number
 * @author-Himanshu Prajapati
 * @version-1.0.0
 * @since-10/11/18
 */
package com.javaprog.functional;

import com.javaprog.Utilities.*;
public class HarmonicNumber {

	public static void main(String args[])
	{
		Utility input=new Utility();
		int n=input.getInt();
		Utility.NHarmonic(n);
	}
}
