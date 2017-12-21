// Name: Nanako Chung
// Date: March 21st, 2017
// Description: this program creates a 5x5 dimension with either a circle or a square (chosen at random). If mouse is clicked, the shapes will shuffle

// sets up processing within eclipse
import processing.core.PApplet;
public class ArrayVisualization extends PApplet{
	public static void main(String[] args) {
		PApplet.main("ArrayVisualization");
	}
	
	//method that sets up size of sketch in pixels
	public void settings(){
		size(500,500);
	}

	//method that runs once at the beginning
	public void setup(){
		
		//color of the shape is white
		fill(225,225,225);
		
		//color of the background is black
		background(0,0,0);
		
		//creates an empty 5x5 array
		int[][] array=new int[5][5];

		// iterates over each column
		for (int col=0; col<array.length; col++) {
			
			// iterates over each row in the column
			for (int row=0; row<array.length; row++) {
				
				// assigns either a 0 or 1 (at random) to each position in the array
				array[col][row]=(int)(Math.random()*2);
				
				// if the position contains a 0, call the ellipse function and position it accordingly
				if (array[col][row]==0) {
					ellipse((50+100*row), (50+100*col), 50,50);
				
				// otherwise, call the rectangle function to create a square
				} else {
					rect((25+100*row), (25+100*col), 50,50);
				}
			}
		} 
	}

	//runs over & over again as long as program is still running
	public void draw() {
		background(0);
		// if the mouse is pressed, then call the setup() function to run it one time and capture that frame
		if (mousePressed) {
			setup();
		}
	}
}

