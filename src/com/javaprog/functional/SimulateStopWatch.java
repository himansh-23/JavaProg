/**
 * Compilation javac SimulateStopWatch.java
 * Execution java com.javaprog.StopWatch
 * Purpose: For Measuring Time Elapsed Between Start and Stop.
 * @author-Himanshu Prajapati
 * @version-1.0.0
 * @since-10/11/18
 */
package com.javaprog.functional;

import com.javaprog.Utilities.*;
public class SimulateStopWatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Utility input=new Utility();
		
		System.out.println("Press A Number for starting stop watch");
		input.getInt();
		
		long start=Utility.stopWatch();	
		System.out.println("Press A Number for stoping stop watch");
		input.getInt();
		long end=Utility.stopWatch();
		
		System.out.println((end-start)/1000+" Seconds");
		
	}

}
