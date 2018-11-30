package com.javaprog.algorithm;

import com.javaprog.Utilities.Utility;

public class SortingSearchingTime {

	public static void main(String[] args) 
	{
		// Binary Search Of String And Numbers And Their Time
			String s[]= {"abc","ldi","bcd"};
			String search="ldi";
			long start=System.nanoTime();
			Utility.binarySearchString(s, search);
			long end=System.nanoTime();
			System.out.println();

			System.out.println("Binary Search Of String "+(end-start)+" nanoSeconds");
			int arr[]= {9,1,7,3,2,4,6,5,8,9,1,7,3,2,4,6,5,8,9,1,7,3,2,4,6,5,8};
			int search1=5;
			start=System.nanoTime();
			Utility.binarySearchInteger(arr, search1);
			end=System.nanoTime();
			System.out.println();

			System.out.println("Binary Search Of Numbers "+(end-start)+" nanoSeconds");
			
		// Bubble Sort Of String And Numbers And Their Time
			int arr2[]= {9,1,7,3,2,4,6,5,8,9,1,7,3,2,4,6,5,8,9,1,7,3,2,4,6,5,8};
			 start=System.nanoTime();
			Utility.bubbleSortInt(arr2);
			 end=System.nanoTime();
			System.out.println();
			System.out.println("Bubble Sort Of Numbers "+(end-start)+"  nanoSeconds");
			
			String s1[]= {"abf","abd","abe"};
			start=System.nanoTime();
			Utility.bubbleSortString(s1);
			end=System.nanoTime();

			System.out.println();
			System.out.println("Bubble Sort Of String "+(end-start)+"  nanoSeconds");
			
		// Insertion Sort Of String And Numbers And Their Time	
			
			int arr3[]= {9,1,7,3,2,4,6,5,8};
			 start=System.nanoTime();
			Utility.insertionSortInt(arr3);
			 end=System.nanoTime();
			System.out.println();
			System.out.println("Insertion Sort Of String "+(end-start)+"  nanoSeconds");
			
			String s3[]= {"abc","abd","abe"};
			start=System.nanoTime();
			Utility.insertionSortString(s3);
			end=System.nanoTime();
			
			System.out.println();
			System.out.println("Insertion Sort Of String "+(end-start)+"  nanoSeconds");
			
	}

}
