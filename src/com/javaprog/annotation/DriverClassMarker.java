/*
 * Purpose -For Execution of Custom Annotations
 * 
 */


package com.javaprog.annotation;

@MyAnnotationTarget
public class DriverClassMarker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		check();
	}
		@MyAnnotation
		public static  void check()
		{
			System.out.println("Hello");
		}
		
		/*public static void check2()
		{
			System.out.println("Bye");
		}*/
}
