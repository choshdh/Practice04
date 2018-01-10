package com.javaex.problem05;

public class SoundApp {

    public static void main(String[] args) {
        printSound( new Cat() );
        printSound( new Dog() );
        printSound( new Sparrow() );
        printSound( new Duck() );
    }

    //매개 변수로 받아온 인자의 인스턴스를 확인하여 다운 캐스팅시켜 오버라이딩 된 함수가 호출될수 있도록 설계 그래야만 각자 다른 sound()를 낼 수있다.
    public static void printSound( Soundable soundable ) {
        //구현
    	if(soundable instanceof Cat) {
    		System.out.println(((Cat)soundable).sound());
    	}else if(soundable instanceof Dog){
    		System.out.println(((Dog)soundable).sound());
    	}else if(soundable instanceof Sparrow) {
    		System.out.println(((Sparrow)soundable).sound());
    	}else if(soundable instanceof Duck){
    		System.out.println(((Duck)soundable).sound());
    	}
    }
    
}
