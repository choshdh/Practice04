package com.javaex.problem03;

public class SmartPhone extends MusicPhone {
    
    public void execute(String str){
        if(str.equals("앱")) {
        	playApp();
        }else if(str.equals("음악")) {
        	playMusic();
        }else {
        	super.execute(str);
        }
        //코드작성
        
    }

    
    //메소드작성
	@Override
	protected void playMusic() {
		// TODO Auto-generated method stub
		System.out.println("다운로드해서 음악재생");
	}
 
    
	//메소드작성
	public void playApp() {
		System.out.println("앱실행");
	}
    
    
    
    
    
    
}
