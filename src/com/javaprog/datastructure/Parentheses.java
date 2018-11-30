package com.javaprog.datastructure;

import com.javaprog.Utilities.*;

public class Parentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Utility input=new Utility();
		String s=input.getString();
		s="(5+6)∗(7+8)/(4+3)(5+6)∗(7+8)/(4+3)";
		boolean b=Utility.parenthesesMatching(s);
		
		if(b)
		{
			System.out.println("Parentheses Are Balenced");
		}
		else
		{
			System.out.println("Parentheses Are Not Balenced");
		}
	}

}
