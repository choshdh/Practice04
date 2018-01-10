package com.javaex.problem03;

public class SmartPhone extends MusicPhone {
    
	//부모가 가진 메소드 오버라이딩
    public void execute(String str){
        if(str.equals("앱")) {
        	playApp();
        }else if(str.equals("음악")) {
        	playMusic();
        }else {
        	super.execute(str);
        }
    }

    
    //메소드작성
    //부모가 가진 메소드 오버라이딩
	@Override
	protected void playMusic() {
		// TODO Auto-generated method stub
		System.out.println("다운로드해서 음악재생");
	}
 
    
	//메소드작성
	//새로운 메소드 생성
	public void playApp() {
		System.out.println("앱실행");
	}
    
    
    
    
    
    
}
