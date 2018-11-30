/**
 * Compilation javac StringReplace.java
 * Execution java com.bridgelabz.Functional.StringReplace
 * Purpose: For Changing String Templace username with user input
 * @author-Himanshu Prajapati
 * @version-1.0.0
 * @since-10/11/18
 */

package com.javaprog.functional;

import com.javaprog.Utilities.*;
public class StringReplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creating Utility class Object
		Utility input=new Utility();
		//Taking username as Input
		String s1=input.getString();
		//Changing String template with username
		s1=Utility.stringTemplateReplace(s1);
		
		System.out.println(s1);
	}
	
}
