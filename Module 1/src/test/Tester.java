package test;

class Rectangle{
	private double length, width;
	
	public double getLength() {
		return length;
		
	}
	public void setLength(double length) {
		this.length = length;
		
	}
	public double getWidth() {
		return width;	
	}
	public void setWidth(double width) {
		this.width = width;	
	}
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;	
	}
	
	public double computeArea() {
		return width * length;
	}
}


class Circle{
	private double radius;
	
	public double getradius() {
		return radius;
	}
	public void setradius(double radius) {
		this.radius = radius;
	}
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double computeArea() {
		return radius*radius* (Math.PI) ;
	}
}
public class Tester{
	public static void main(String[] args) {
		Rectangle case1 = new Rectangle(4,5);
		
		Rectangle case2 = new Rectangle(5.7,8.1);
	
		Circle case3 = new Circle(4.2);
		
		Circle case4 = new Circle(3.0);
		
		System.out.println("Rectangle with sides " + case1.getLength() + " and " + case1.getWidth()
        + " has area " + case1.computeArea());
		
		System.out.println("Rectangle with sides " + case2.getLength() + " and " + case2.getWidth()
        + " has area " + case2.computeArea());
		
		System.out.println("Circle with radius " + case3.getradius() + " has area " + case3.computeArea());
		
		System.out.println("Circle with radius " + case4.getradius() + " has area " + case4.computeArea());
		
	}
}