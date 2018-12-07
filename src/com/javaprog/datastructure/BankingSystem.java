/**
 * Compilation javac BankingSystem.java
 * Execution java com.javaprog.datastructure.BankingSystem
 * Purpose: For Simulating Banking Queue of Person For Deposit and Withdraw money
 * @author-Himanshu Prajapati
 * @version-1.0.0
 * @since-22/11/18
 */

package com.javaprog.datastructure;

import com.javaprog.Utilities.*;
public class BankingSystem {

	public static void main(String[] args) {
		
		//int n=input.getInt();
		//
		int amountleft=Utility.simulateBanking();
		System.out.println("AmountLeft = "+amountleft);
		
	}

}
