/**
 * Compilation javac BinarySearchFiles.java
 * Execution com.bridgelabz.Algorithm.BinarySearchFiles
 * Purpose: Finding A String In A File Where String Are Seprated By "," If Not Found Then Add That String To File
 * @author-Himanshu Prajapati
 * @version-1.0.0
 * @since-12/11/18
 */
package com.javaprog.algorithm;

import com.javaprog.Utilities.*;
public class BinarySearchFiles {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Utility input=new Utility();
		System.out.println("Enter Search Element");
		String search=input.getString();
		try {
				boolean flag=Utility.searchInFile(search,",");
				if(flag)
				{
					System.out.println("String Found");
				}
				else
				{
					System.out.println("String Not Found");
				}
			}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
