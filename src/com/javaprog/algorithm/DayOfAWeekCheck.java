/**
 * Compilation javac DayOfAWeekCheck.java
 * Execution com.bridgelabz.Algorithm.DayOfAWeekCheck
 * Purpose: Finding Day Of A Random Date Given By User
 * @author-Himanshu Prajapati
 * @version-1.0.0
 * @since-13/11/18
 */
package com.javaprog.algorithm;

import com.javaprog.Utilities.*;
public class DayOfAWeekCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			int month=Integer.parseInt(args[0]);
			int day=Integer.parseInt(args[1]);
			int year=Integer.parseInt(args[2]);
			int result=Utility.dayOfWeek(month,day,year);
			String arr[]= {"Sunday","Monday","Tuesday","Wednesday","Thrusday","Friday","Saturday",};
			System.out.println(arr[result]);
		
	}

}
