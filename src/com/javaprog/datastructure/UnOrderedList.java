/**
 * Compilation javac UnOrderedList.java
 * Execution java com.javaprog.dataStructure.UnOrderedList
 * Purpose: Finding Space Seprated List From File and Search a String If Not Found And Then Add It To File.
 * @author-Himanshu Prajapati
 * @version-1.0.0
 * @since-15/11/18
 */
package com.javaprog.datastructure;

import com.javaprog.Utilities.*;
public class UnOrderedList {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Utility input=new Utility();
		System.out.println("Enter String To Search");
		String search=input.getString();
		Utility.UnorderedListSearching(search);
	}

}
