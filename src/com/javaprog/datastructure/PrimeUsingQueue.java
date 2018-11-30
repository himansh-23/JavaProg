package com.javaprog.datastructure;

import com.javaprog.Utilities.Queue;
import com.javaprog.Utilities.Utility;

public class PrimeUsingQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Queue<Integer> q1= Utility.primeAnagramQueue();
				
				while(!q1.isEmpty())
				{
					System.out.println(q1.dequeue());
				}
	}

}
