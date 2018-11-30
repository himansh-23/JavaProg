package com.javaprog.datastructure;

import com.javaprog.Utilities.Utility;

public class PrimeArrayPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Utility input=new Utility();
		System.out.println("Enter Range Between 0 to 1000");
		int n=input.getInt();
		int arr[][]=Utility.array2DOfPrime(n);
		int inr=1;
		int enr=100;
		int i=0,j=0;
		for(i=0;arr[i][j]!=0;)
		{
			System.out.print("Range "+inr+"-->"+enr+"  ");
			for(j=0;arr[i][j]!=0;j++)
			{
				
				System.out.print(arr[i][j]+" ");
			}
			j=0;
			inr=inr+100;
			if(enr+100>n)
			{
				enr=n;
			}
			else
			{
				enr=enr+100;
			}
			i++;
			if(i>=10)
			{
				break;
			}
			
			System.out.println();
		}
	}
}
