/**
 * Compilation javac TicTacToe.java
 * Execution java com.javaprog.TicTacToe
 * Purpose: Tic Tac Toe Game 
 * @author-Himanshu Prajapati
 * @version-1.0.0
 * @since-12/11/18
 */
package com.javaprog.functional;

import com.javaprog.Utilities.*;
import java.util.Random;

public class TicTacToe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char arr[][]=new char[3][3];
		Utility input=new Utility();
		
		Utility.fill('C',arr);
		Utility.show(arr);

		int count=9;
		Random r=new Random();
		boolean flag=true;
		while(count>0)
		{
			if(flag)
			{
				boolean flag2=true;
				while(flag2)
				{
					int x=r.nextInt(3);
					int y=r.nextInt(3);
					if(arr[x][y]=='C')
					{
						flag2=false;
						arr[x][y]='X';
					}
					
				}
				System.out.println();
				Utility.show(arr);
				boolean flag3=Utility.winCheck('X', arr);
				if(flag3)
				{
					System.out.println("Computer Win's");
					break;
				}
				count--;
				flag=!flag;
			}
			else
			{
				System.out.println("User Chance");
				System.out.println("Enter Row and Column Between 1 and 3");
				 int x=input.getInt();
				 int y=input.getInt(); 
				 
				 if(arr[x-1][y-1]=='C')
				 {
					 arr[x-1][y-1]='O';
				 }
				 else
				 {
					 while(arr[x-1][y-1]!='C')
					 {
					 System.out.println("Already Occupied Take Another Chance");
					 x=input.getInt();
					 y=input.getInt();
					 }
					 arr[x-1][y-1]='O';  
				 }
				 boolean flag3=Utility.winCheck('O', arr);
				 
				 if(flag3)
				 {
					 System.out.println("User Win's");
					 break; 
				 }
				 flag=!flag;
				 count--;
			}
		}
		if(count<0)
		{
			System.out.println("Match is Tie");
		}
		
	}

}
