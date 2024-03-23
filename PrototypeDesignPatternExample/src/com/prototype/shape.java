package com.prototype;

public class shape implements Prototype {
	
	private String type;
	
	public shape(String type)
	{
		this.setType(type);
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public Prototype clone()
	{
		return new shape("circle");
	}
}
