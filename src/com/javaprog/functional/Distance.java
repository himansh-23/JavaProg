/**
 * Compilation javac Distance.java
 * Execution java com.javaprog.Functional.Distance
 * Purpose: For Measuring EuclideanDistance Between Two Point
 * @author-Himanshu Prajapati
 * @version-1.0.0
 * @since-10/11/18
 */

package com.javaprog.functional;

import com.javaprog.Utilities.*;
public class Distance {

	public static void main(String args[])
	{
		Utility input=new Utility();
		int x=input.getInt();
		int y=input.getInt();
		System.out.println(Utility.euclideanDistance(x,y));
	//	System.out.println(Utility.euclideanDistanceFun.apply(x, y));
	}
}
