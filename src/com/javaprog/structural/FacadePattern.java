package com.javaprog.structural;

public class FacadePattern {
	
	public static void main(String[] args) throws Exception {
		
		ShapeMaker obj1=new ShapeMaker();
		obj1.drawCircle();
		obj1.drawRectangle();
		obj1.drawSquare();
	}
}
