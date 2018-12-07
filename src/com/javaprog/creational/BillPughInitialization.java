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

class MainBillPughInitialization
{
	public static void main(String args[]) {
		BillPughInitialization x=BillPughInitialization.getInstance();
		BillPughInitialization y=BillPughInitialization.getInstance();
		System.out.println(x.hashCode());
		System.out.println(y.hashCode());
		
	}
}
