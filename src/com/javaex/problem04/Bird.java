package com.javaex.problem04;

public abstract class Bird { //1.추상 메소드가 하나라도 존재할시 추상클래스로 존재하여야함
							 //2.new 연산자를 통하여 스스로 객체화 되는것을 방지해야한다면 추상 클래스로 선언하여 자식을 통해서만 객체화가 가능하게 만든다.
    private String name;
    
    public abstract void fly(); //함수가 해야할 기능의 이름만 정의 해놓은 추상 메소드
    public abstract void sing(); //함수가 해야할 기능의 이름만 정의 해놓은 추상 메소드
    public abstract void showName(); //함수가 해야할 기능의 이름만 정의 해놓은 추상 메소드

	protected String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



}
