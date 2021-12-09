package com.javaex.ex02;

public abstract class Bird {
    private String name;

    abstract void sing();
    
    abstract void fly();

    public void setName(String name) {
    	this.name = name;
    }
    
    protected String getName() {
    	return name;
    }
    
    abstract void showName();
}
