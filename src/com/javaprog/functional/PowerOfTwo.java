/**
 * Compilation javac PowerOfTwo.java
 * Execution java com.javaprog.PowerOfTwo
 * Purpose: For Finding Power Of 2 if(N<31) till N.
 * @author-Himanshu Prajapati
 * @version-1.0.0
 * @since-10/11/18
 */

package com.javaprog.functional;

import com.javaprog.Utilities.*;
public class PowerOfTwo {
	public static void main(String args[])
	{
		Utility input=new Utility();
		System.out.println("Enter digit");
		int n=input.getInt();
		if(n<31)
			Utility.TableOfTwo(n);
		else
			System.out.println("Power To High");
	}

}
