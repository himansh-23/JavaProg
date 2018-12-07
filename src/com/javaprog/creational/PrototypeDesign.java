/**
 * Compilation javac PrototypeDesign.java
 * Execution java com.javaprog.creational.MainPrototypeDesign
 * Purpose: For Creating Clone of A Object so do different task with it.
 * @author-Himanshu Prajapati
 * @version-1.0.0
 * @since-6/12/18
*/

package com.javaprog.creational;

import java.util.ArrayList;
import java.util.List;

public class PrototypeDesign implements Cloneable{

	List<String> list;
	
	public PrototypeDesign()
	{
		list=new ArrayList<String>();
	}
	
	public PrototypeDesign(List<String> list)
	{
		this.list=list;
	}
	
	public void add(String s)
	{
		list.add(s);
	}
	public List<String> getData()
	{
		return this.list;
	}
	
	public Object clone() throws CloneNotSupportedException
	{
		
		List<String> temp=new ArrayList<>();
		for(String s:this.getData())
		{
			temp.add(s);
		}
		return new PrototypeDesign(temp);
	}
}

class MainPrototypeDesign
{
	public static void main(String args[]) throws CloneNotSupportedException
	{
		PrototypeDesign obj1=new PrototypeDesign();
		obj1.add("hello");
		obj1.add("bye");
		PrototypeDesign obj2=(PrototypeDesign) obj1.clone();
		obj2.add("Good");
		System.out.println(obj1.getData());
		System.out.println(obj2.getData());
	}
	
}