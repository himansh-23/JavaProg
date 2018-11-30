/**
 * Compilation javac LeapYear.java
 * Execution java com.javaprog.LeapYear
 * Purpose: For Finding a year is leap year or Not
 * @author-Himanshu Prajapati
 * @version-1.0.0
 * @since-10/11/18
 */
package com.javaprog.functional;
import com.javaprog.Utilities.Utility;
public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Utility input=new Utility();
		int n=input.getInt();
		
		
		while(n<1000 && n>9999)
		n=input.getInt();
		
		boolean b=Utility.isLeapYear(n);
		if(b)
		{
		System.out.println("Leap Year");	
		}
		else
		{
			System.out.println("Not Leap Year");
		}
	}

}
