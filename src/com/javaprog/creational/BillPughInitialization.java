package com.javaprog.creational;

public class BillPughInitialization {
	
	private static class SingletonHelper
	{
		private static final BillPughInitialization obj=new BillPughInitialization();
	}
	
	private BillPughInitialization()
	{
		
	}
	public static BillPughInitialization getInstance()
	{
		return SingletonHelper.obj;
	}

}
