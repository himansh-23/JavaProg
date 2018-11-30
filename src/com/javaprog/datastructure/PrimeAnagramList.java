package com.javaprog.datastructure;

import com.javaprog.Utilities.*;
public class PrimeAnagramList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Utility input=new Utility();
		System.out.println("Enter range");
		int n=input.getInt();
		Utility.primeAnagramList(n);
	}

}
