// Name: Nanako Chung
// Date: May 2nd, 2017
// Description: creates class called Triangle

//subclass of GeometricObject class
public class Triangle extends GeometricObject{

	//three doubles
	private double side1;
	private double side2;
	private double side3;

	//no-arg constructor with default 1.0 for length of sides
	Triangle(){
		this.side1=1.0;
		this.side2=1.0;
		this.side3=1.0;
	}

	//constructor that takes 3 doubles for sides to create a triangle
	Triangle(double side1, double side2, double side3) throws IllegalArgumentException{
		if (((side1+side2)>side3)&&((side2+side3)>side1)&&((side1+side3)>side2)) {
			//otherwise, the sides are set to the desired lengths
			this.side1=side1;
			this.side2=side2;
			this.side3=side3;
		} else {
			//throws illegal argument exception if the triangle does not follow the rule
			throw new IllegalArgumentException("Triangle doesn't follow the rule.");
		}
	}

	//getter for side1
	public double getSide1(){
		return side1;
	}

	//getter for side2
	public double getSide2(){
		return side2;
	}

	//getter for side3
	public double getSide3(){
		return side3;
	}

	//method that computes area of triangle
	public double getArea(){
		double side4=(getPerimeter())/2;
		double area=Math.sqrt(side4*(side4-side1)*(side4-side2)*(side4-side3));
		return area;
	}

	//method that computes perimeter of triangle
	public double getPerimeter(){
		return this.side1+this.side2+this.side3;
	}

	//method that returns a string description of the triangle
	public String toString(){
		return ("Triangle: side 1 = "+side1+", side 2 = "+side2+", side 3 = "+side3);
	}
}
