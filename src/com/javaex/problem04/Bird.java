package com.javaex.problem04;

public abstract class Bird {
    private String name;
    
    public abstract void fly();
    public abstract void sing();
    public abstract void showName();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



}
