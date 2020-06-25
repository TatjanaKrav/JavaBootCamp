package sef.module6.activity;

public class Rectangle extends Shape {
	private double length, breadth;
	
	public Rectangle(){ 
		System.out.println("I'm a Rectangle Constructor"); 
	}
	
	public Rectangle (double length,double breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	
	// getter for double length
	public double getlength() {
		return length;
	}
	// setter for double  length
	public void setlength(double length) {
		this.length = length;
	}
	
	// getter for double breadth
	public double getbreadth() {
		return breadth;
	}
	// setter for double  breadth
	public void setbreadth(double breadth) {
		this.breadth = breadth;
	}
	
	public double calculateArea () {
		return length * breadth;
	}
	
	public double calculatePerimeter () {
		return 2*(length * breadth);
	}
	
}
