package com.javaex.problem05;

public class SoundApp {

    public static void main(String[] args) {
        printSound( new Cat() );
        printSound( new Dog() );
        printSound( new Sparrow() );
        printSound( new Duck() );
    }

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
