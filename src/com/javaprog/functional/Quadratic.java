/**
 * Compilation javac Quadratic.java
 * Execution java com.javaprog.Quadratic
 * Purpose: For Finding Roots Of A Quadratic Equation
 * @author-Himanshu Prajapati
 * @version-1.0.0
 * @since-12/11/18
 */
package com.javaprog.functional;

import com.javaprog.Utilities.*;
public class Quadratic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Utility input=new Utility();
		double a=input.getInt();
		double b=input.getInt();
		double c=input.getInt();
		
		Utility.root(a,b,c);
	}

}
