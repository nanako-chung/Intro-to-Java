// Name: Nanako Chung
// Date: March 21st, 2017
// Description: creates an animation using processing

//sets up processing within eclipse
import processing.core.PApplet;
public class GifGreat extends PApplet{
	public static void main(String[] args) {
		PApplet.main("GifGreat");
	}
	
	// variables used later for the x and y coordinates of the shape
	int positionY=0;
	int positionX=0;
	
	//this method set up size of sketch in pixels
	public void settings(){
		size(500,500);
	}

	//this method runs once at the beginning
	public void setup(){
		//sets the shape color to white
		fill(225,225,225);
		//sets background color to royal blue
		background(0,20,130);
	}

	//this method runs over & over again as long as program is still running
	public void draw(){
		
		//creates a rectangle and moves its position by 1 along both the x and y axis
		rect(positionX,positionY,50,50);
		positionX+=1;
		positionY+=1;
	}
}