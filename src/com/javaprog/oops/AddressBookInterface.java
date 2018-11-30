package com.javaprog.oops;

import java.util.List;

public interface AddressBookInterface 
{
	public void operation(List<Person> arrayRead);
	public void add();
	public void edit();
	public void delete();
	public void sortByName();
	public void sortByZip();
	public void print();
}