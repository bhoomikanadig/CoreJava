package com.xworkz.corejava.HashCode.toString;

public class Winow { 
	String type;
	double height;
	double width;
	
	Winow(String type,double height,double width){
		this.type=type;
		this.height=height;
		this.width=width;
	}

	@Override
	public String toString() {
		return "Winow [type=" + type + ", height=" + height + ", width=" + width + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	

}
