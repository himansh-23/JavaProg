/**
 * Compilation javac FlipCoinPercentage.java
 * Execution java com.javaprog.Functional.FlipCoinPercentage
 * Purpose: Finding Head and Tail % For N Filps
 * @author-Himanshu Prajapati
 * @version-1.0.0
 * @since-10/11/18
 */

package com.javaprog.functional;

import com.javaprog.Utilities.*;
public class FlipCoinPercentage {
	public static void main(String args[])
	{
	int n=-1;
	Utility input=new Utility();
	while(n<0)
	{
		n=input.getInt();
	}
	double result=Utility.percentageOfHeadTail(n);
	
	System.out.println("Head %="+result*100+"  Tail %="+(1-result)*100);
	
	}
}
