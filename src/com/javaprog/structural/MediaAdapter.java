package com.javaprog.structural;

public class MediaAdapter implements MediaPlayer{
	
	 AdvancedMediaPlayer obj1;
	public MediaAdapter(String audioType){
		   
	      if(audioType.equalsIgnoreCase("wmv") ){
	    	  obj1= new Vlc();			
	         
	      }else if (audioType.equalsIgnoreCase("mp4")){
	    	  obj1 = new KMPlayer();
	      }	

		}
	@Override
	public void play(String name, String type) {
		// TODO Auto-generated method stub
		if(type.equals("mp4"))
		{
			obj1.playmp4(name);
		}
		else if(type.equals("wmv"))
		{
			obj1.playwmv(name);
		}
	}
}
