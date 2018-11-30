package com.javaprog.datastructure;

import com.javaprog.Utilities.*;
public class PalindromeChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Utility input=new Utility();
		
		String s=input.getString();
		
		boolean b=Utility.palindromeChecker(s);
		if(b)
		{
			System.out.println("Palidrome");
		}
		else
		{
			System.out.println("Not A Palidrome");
		}
	}

}
