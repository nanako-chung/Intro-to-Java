//Name: Nanako Chung
//Date: March 27th, 2017
//Description: testing the Rectangle class

// simple test class
public class TestRectangle {
	
	// main method
	public static void main(String[] args) {

		// noArgRect is reference variable name for a new default rectangle within the class Rectangle
		Rectangle noArgRect=new Rectangle();

		// calling the getPerimeter() and getArea() methods to display the noArgRect's area and perimeter
		System.out.println("Perimeter of default rectangle: "+noArgRect.getPerimeter());
		System.out.println("Area of default rectangle: "+noArgRect.getArea());

		// givenDimensionsRect is reference variable name for a new rectangle with given width and height within the class Rectangle
		Rectangle givenDimensionsRect=new Rectangle(10, 5);

		// calling the getPerimeter() and getArea() methods to display the givenDimensionsRect's area and perimeter
		System.out.println("Perimeter of rectangle of width 10 & height 5: "+givenDimensionsRect.getPerimeter());
		System.out.println("Area of rectangle with width 10 & height 5: "+givenDimensionsRect.getArea());

		// shows how many rectangles were created in total
		System.out.println("Number of rectangles created: "+Rectangle.Count());
	}
}
