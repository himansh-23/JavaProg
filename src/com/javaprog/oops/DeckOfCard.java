 package com.javaprog.oops;

import com.javaprog.Utilities.Utility;

/** Purpose - For Distributing 9 Cards To 4 Peoples
 * Compilation javac DeckOfCard.java
 * Execution java com.javaprog.oops.DeckOfCard
 * @author Himanshu Prajapati
 * @version-1.0.0
 * @since-24/11/18
 */

public class DeckOfCard {

	public static void main(String[] args) 
	{	
		String playercard[][]=Utility.cardDistribute();
		
		System.out.println("Player 1      Player 2       Player 3        Player 4");
		System.out.println();
		int x=0;
		int y=0;
		for(int i=0;i<9;i++)
		{
			for(int j=0;j<4;j++)
			{
				System.out.print(playercard[x][y]+"       ");
				y++;
				if(y==9)
				{
					y=0;
					x++;
				}
			}
				System.out.println();
		}
	
	}

}
