/**
 * Compilation javac Hashing.java
 * Execution java com.javaprog.datastructure.Hashing
 * Purpose: For Reading Number From File And Arrange it into HashTable For Searching
 * @author-Himanshu Prajapati
 * @version-1.0.0
 * @since-22/11/18
 */

package com.javaprog.datastructure;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.javaprog.Utilities.Utility;

public class Hashing {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		
		Utility input=new Utility();
		System.out.println("Enter Number To Search");
		int search=input.getInt();
		boolean b=Utility.hasingSearch(search);
		if(!b)
		{
			System.out.println("Number Was Not in List. added to list");
		}
		else
		{
			System.out.println("Number Deleted From list");
		}
	}

}
