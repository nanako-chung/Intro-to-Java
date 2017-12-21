// Name: Nanako Chung
// Date: May 2nd, 2017
// Description: test class that creates an ArrayList of Triangle type and prints out data about each Triangle

import java.util.ArrayList;

public class TestTriangle{

	public static void main(String[] args) {
		
		//creates an ArrayList of 5 triangle objects
		ArrayList<Triangle> triangles=new ArrayList<>(5);
		
		//sets triangle's properties to something other than default and wraps them in a try-catch block
		try {
			Triangle tri1=new Triangle(5,4,7);
			tri1.setColor("Yellow");
			tri1.setFilled(true);
			triangles.add(tri1);
		} catch (IllegalArgumentException e){
			System.out.println(e.toString());
		}

		//sets triangle's properties to something other than default and wraps them in a try-catch block
		try {
			Triangle tri2=new Triangle(1,2,1);
			tri2.setColor("Green");
			tri2.setFilled(true);
			triangles.add(tri2);
		} catch (IllegalArgumentException e){
			System.out.println(e.toString());
		}

		//sets triangle's properties to something other than default and wraps them in a try-catch block
		try {
			Triangle tri3=new Triangle(12,13,5);
			tri3.setColor("Blue");
			tri3.setFilled(true);
			triangles.add(tri3);
		} catch (IllegalArgumentException e){
			System.out.println(e.toString());
		}

		//sets triangle's properties to something other than default and wraps them in a try-catch block
		try {
			Triangle tri4=new Triangle(0,1,1);
			tri4.setColor("Orange");
			tri4.setFilled(true);
			triangles.add(tri4);
		} catch (IllegalArgumentException e){
			System.out.println(e.toString());
		}

		//sets triangle's properties to something other than default and wraps them in a try-catch block
		try {
			Triangle tri5=new Triangle(5,1,6);
			tri5.setColor("Red");
			tri5.setFilled(true);
			triangles.add(tri5);
		} catch (IllegalArgumentException e){
			System.out.println(e.toString());
		}

		System.out.println();
		
		//loops through the ArrayList and prints out the sides, colors, and whether each Triangle is filled
		for (Triangle t: triangles){
			System.out.println(t.toString());
			System.out.println("Color: "+t.getColor());
			System.out.println("Filled: "+t.isFilled());
			System.out.println();
		}
	}
}
