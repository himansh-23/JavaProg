package com.javaprog.oops;

import com.javaprog.Utilities.Utility;

public class AddressBookApplication {

	public static void main(String[] args) {
		Utility input=new Utility();
		AddressManagerInterface manager=new AddressManager();
		System.out.println("Welcome To Address Book");
		boolean fileOpenFlag=false;
		int Answer=0;
		do {
			System.out.println("Choose Operation You Want To Do");
			System.out.println("1.Create");
			System.out.println("2.Open");
			System.out.println("3.Save");
			System.out.println("4.SaveAs");
			System.out.println("5.Exit");
			Answer=input.getInt();
			switch(Answer)
			{
				case 1:
					if(fileOpenFlag==true)
					{
						System.out.println(" Do You Want To Close Changes\n1. Yes\n 2.No");
						byte check=input.getByte();
						if(check==(byte)1)
						{
							manager.save();
						}
					}
					manager.create();
					break;
				case 2:
					fileOpenFlag=manager.open();
					break;
				case 3:
					manager.save();
					break;
				case 4:
					manager.saveAs();
					break;
				case 5:
					manager.quit();
					System.out.println("Exiting");
					break;
				default:
					System.out.println("Invalid Entry");
			}
		}while(Answer!=5);
	}
}
