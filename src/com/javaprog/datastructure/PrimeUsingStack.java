package com.javaprog.datastructure;

import com.javaprog.Utilities.Utility;
import com.javaprog.Utilities.Stack;
public class PrimeUsingStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> s1= Utility.primeAnagramStack();
		
		while(!s1.isEmpty())
		{
			
			System.out.println(s1.pop());
		}
		
	}

}
