/**
 * Compilation javac CalenderPrint.java
 * Execution java com.javaprog.datastructure.CalenderPrint
 * Purpose: For Printing Calender of Particular Date And Year 
 * @author-Himanshu Prajapati
 * @version-1.0.0
 * @since-22/11/18
 */

package com.javaprog.datastructure;

import com.javaprog.Utilities.Utility;

public class CalenderPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int month=Integer.parseInt(args[0]);
		int year=Integer.parseInt(args[1]);
		Utility.calenderShow(month, year);
		
	}

}
