/**
 * Compilation javac WindChill.java
 * Execution java com.javaprog.WindChill
 * Purpose: Finding WindChill
 * @author-Himanshu Prajapati
 * @version-1.0.0
 * @since-12/11/18
 */
package com.javaprog.functional;

import com.javaprog.Utilities.*;
public class WindChill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double t=Double.parseDouble(args[0]);
		double v=Double.parseDouble(args[1]);
		double w=Utility.wind(t,v);
		System.out.println(w);
	}

}
