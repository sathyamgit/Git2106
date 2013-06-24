package com.olabsys.simple;

public class Traveler {
	
	Vehicle v;
	public void set(Vehicle v)
	{
		this.v=v;
	}
	void start(){
		v.move();
	}
	
}
