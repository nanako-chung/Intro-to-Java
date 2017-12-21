//Name: Nanako Chung
//Date: March 27th, 2017
//Description: experimenting with objects to erect a rectangle

class Rectangle {

	// static object count that keeps track of how many rectangles were created
	static int counter=0;

	// 2 double data fields width & height with default values of 1
	double width=1; 
	double height=1;

	// no-arg constructor that constructs a default rectangle object
	Rectangle() {
		counter++;
	}

	// constructor that makes a rectangle object with a given width & height
	Rectangle(double newWidth, double newHeight) {
		width=newWidth;
		height=newHeight;
		counter++;
	}

	// static method that returns # of rectangles created
	static int Count() {
		return counter;
	}

	// method that returns the area of this rectangle 
	double getArea() {
		return width * height;
	}

	// method that returns the perimeter of this rectangle
	double getPerimeter() {
		return (2*width)+(2*height);
	}
}
