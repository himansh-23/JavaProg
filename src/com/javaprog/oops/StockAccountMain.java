package com.javaprog.oops;

import java.io.File;
import java.io.FileReader;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.javaprog.Utilities.Utility;

public class StockAccountMain {

	public static void main(String[] args)
	{	
		int Answer=0;
		Utility input=new Utility();
		do
		{
			System.out.println("1. Create A Account");
			System.out.println("2. Login");
			System.out.println("3. Exit");
			Answer=input.getInt();
			switch(Answer)
			{
			case 1:
				String name=input.getString();
				StockAccount newperson=new StockAccount(name);
				break;
				
			case 2:
				System.out.println("Enter Name");
				String namelogin=input.getString();
				StockAccount currentperson=new StockAccount(namelogin, 2);
				try {
					int Answer2=0;
					do {
						System.out.println("1. Buy");
						System.out.println("2. Sell");
						System.out.println("3. PrintReport");
						System.out.println("4. Exit");
						Answer2=input.getInt();
						switch(Answer2)
						{
							case 1:
								System.out.println("Enter Symbol");
								String symbol=input.getString();
								System.out.println("Enter number");
								int noofshare=input.getInt();
								currentperson.buy(symbol, noofshare,namelogin);
								break;
							case 2:
								System.out.println("Enter Symbol");
								String symbol1=input.getString();
								System.out.println("Enter number");
								int noofshare1=input.getInt();
								currentperson.sell(symbol1, noofshare1, namelogin);
								break;
							case 3:
								currentperson.printReport();
								break;
							case 4:
								currentperson.save(namelogin);
								System.out.println("Exiting");
								break;
							default :
								System.out.println("Invalid Entry");												
						}
					}while(Answer2!=4);
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}		
				break;
				
			case 3:
				System.out.println("Exiting");
				break;
			default :
				System.out.println("Invalid Entry");
			}
		}while(Answer!=3);
	}
	
}
