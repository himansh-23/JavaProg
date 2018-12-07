package com.javaprog.structural;

public class AdapterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MediaAdapter obj1=new MediaAdapter("mp4");
		obj1.play(" song", "mp4");
		obj1=new MediaAdapter("wmv");
		obj1.play(" music","wmv");
		
	}

}
