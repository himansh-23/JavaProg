package com.javaprog.oops;

import java.util.ArrayList;
import java.util.List;

import com.javaprog.Utilities.Utility;

public class AddressBook implements AddressBookInterface{
	
	Utility input=new Utility();
	List<Person> list ;
	String firstname="";
	String lastname="";
	String city="";
	String zip="";
	String state="";
	String phone="";
	
	@Override
	public void operation(List<Person> receiveList)
	{
		list=receiveList;
	//	boolean state=true;
		int Answer=0;
		
		do {
			System.out.println("Choose Operation You Want To Do");
			System.out.println("1.Add");
			System.out.println("2.Edit");
			System.out.println("3.Delete");
			System.out.println("4.SortByName");
			System.out.println("5.SortByZip");
			System.out.println("6.Print");
			System.out.println("7.Exit");
			Answer=input.getInt();
			switch(Answer)
			{
				case 1:
					add();
					break;
				case 2:
					edit();
					break;
				case 3:
					delete();
					break;
				case 4:
					sortByName();
					break;
				case 5:
					sortByZip();
					break;
				case 6:
					print();
					break;
				case 7:
					System.out.println("Exiting");
					break;
				default :
					System.out.println("Invalid Entry Re-Enter");
					break;
			}
					
		}while(Answer!=7);
	}
	
	public void add()
	{
		System.out.println("Enter firstname");
		firstname=input.getString();
		System.out.println("Enter lastname");
		lastname=input.getString();
		System.out.println("Enter city");
		city=input.getString();
		System.out.println("Enter zip");
		zip=input.getString();
		System.out.println("Enter state");
		state=input.getString();
		System.out.println("Enter phonenumber");
		phone=input.getString();
		Person tempperson=new Person(firstname,lastname,new Address(city,zip,state,phone));
		list.add(tempperson);
	}
	
	public void edit()
	{
		System.out.println("Enter Person FirstName Of Edited Person");
		firstname=input.getString();
		System.out.println("Enter MobileNumber Of Edited Person");
		phone=input.getString();
		int i=0;
		for(i=0;i<list.size();i++)
		{
			Person temp=list.get(i);
			if(temp.getfirstname().equals(firstname) && temp.getaddress().getphone().equals(phone))
			{
				int Answer2=0;
			do {
					System.out.println("What You Want To Edit");
					System.out.println("1.LastName");
					System.out.println("2.City");
					System.out.println("3.Zip");
					System.out.println("4.State");
					System.out.println("5.Phone");
					System.out.println("6.Exit");
					Answer2=input.getInt();
					switch(Answer2)
					{
						case 1:
							System.out.println("Enter New LastName");
							lastname=input.getString();
							list.get(i).setlastname(lastname);
							break;
						case 2:
							System.out.println("Enter New City");
							city=input.getString();
							list.get(i).address.city=city;
							break;
						case 3:
							System.out.println("Enter New Zip");
							zip=input.getString();
							list.get(i).address.zip=zip;
							break;
						case 4:
							System.out.println("Enter New State");
							state=input.getString();
							list.get(i).address.state=state;
							break;
						case 5:
							System.out.println("Enter New Phone");
							phone=input.getString();
							list.get(i).address.phone=phone;
							break;
						case 6:
							System.out.println("Exiting");
							break;
						default:
							System.out.println("Invalid Entry");
					}
				}while(Answer2!=6);
			break;
			}
		}
		if(i>=list.size())
		{
			System.out.println("No Person Fount With This Details");
		}
	}
	
	public void delete()
	{
		System.out.println("Enter Person FirstName Of Deleted Person");
		firstname=input.getString();
		System.out.println("Enter MobileNumber Of Deleted Person");
		phone=input.getString();
		int i=0;
		for(i=0;i<list.size();i++)
		{
			Person temp=list.get(i);
			if(temp.firstname.equals(firstname) && temp.address.phone.equals(phone))
			{
			//	System.out.println("hello");
				list.remove(i);
				break;
			}
		}
		if(i>=list.size())
		{
			System.out.println("No Person Fount With This Details");

		}
	}
	
	public void sortByName()
	{
		for(int i=0;i<list.size()-1;i++)
		{
			for(int j=i+1;j<list.size();j++)
			{
				if(list.get(i).firstname.compareTo(list.get(j).firstname)>0)
				{
					Person temp1=list.remove(i);
					Person temp2=list.remove(j-1);
					list.add(i, temp2);
					list.add(j,temp1);
				}
			}
		}
	}
	
	public void sortByZip()
	{
		for(int i=0;i<list.size()-1;i++)
		{
			for(int j=i+1;j<list.size();j++)
			{
				if(list.get(i).address.zip.compareTo(list.get(j).address.zip)>0)
				{
					Person temp1=list.remove(i);
					Person temp2=list.remove(j-1);
					list.add(i, temp2);
					list.add(j,temp1);
				}
			}
		}
	}
	
	public void print()
	{
		System.out.println("FirstName   LastName    City        State       Zip         PhoneNumber \n");
		String spaces="            ";
		for(int i=0;i<list.size();i++)
		{
			System.out.print(list.get(i).firstname+spaces.substring(list.get(i).firstname.length(),spaces.length()));
			System.out.print(list.get(i).lastname+spaces.substring(list.get(i).lastname.length(),spaces.length()));
			System.out.print(list.get(i).address.city+spaces.substring(list.get(i).address.city.length(),spaces.length()));
			System.out.print(list.get(i).address.state+spaces.substring(list.get(i).address.state.length(),spaces.length()));
			System.out.print(list.get(i).address.zip+spaces.substring(list.get(i).address.zip.length(),spaces.length()));
			System.out.print(list.get(i).address.phone+spaces.substring(list.get(i).address.phone.length(),spaces.length()));
			System.out.println();
			
		}
		System.out.println();
	}

}
