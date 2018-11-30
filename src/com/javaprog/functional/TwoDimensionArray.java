/**
 * Compilation javac TicTacToe.java
 * Execution java com.javaprog.TicTacToe
 * Purpose: Printing 2-D Array Using PrintWriter
 * @author-Himanshu Prajapati
 * @version-1.0.0
 * @since-12/11/18
 */
package com.javaprog.functional;

import com.javaprog.Utilities.*;
public class TwoDimensionArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Utility input=new Utility();
		int m=input.getInt();
		int n=input.getInt();
		int[][] arr=new int[m][n];
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				arr[i][j]=input.getInt();
			}
		}
		//System.out.println("s");
		Utility.printArray(arr);
	//	System.out.println("s");
		
		
	}

}
