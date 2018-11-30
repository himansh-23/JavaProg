package com.javaprog.datastructure;

import com.javaprog.Utilities.Utility;

public class BinarySearchTreeNumber {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Utility input=new Utility();
		System.out.println("Enter No. Test Cases");
		int t=input.getInt();
		while(t-- >0)
		{
		System.out.println("Enter No. To Find Binary Trees");
		int n=input.getInt();
		Utility.binaryTreeNumber(n);
		
		}
	}

}
