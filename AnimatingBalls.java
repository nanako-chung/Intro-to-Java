//Name: Nanako Chung
//Date: March 27th, 2017
//Description: creates an animation of an array of balls!

//sets up processing within eclipse
import processing.core.PApplet;
public class AnimatingBalls extends PApplet{
	
	// main method
	public static void main(String[] args) {
		PApplet.main("AnimatingBalls");
	}

	// creates a new array called ballArray with 10 elements
	Ball[] ballArray=new Ball[10];

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
		
		//goes through an array and creates a new Ball() for each element in the array
		for (int i=0; i<ballArray.length; i++) {
			ballArray[i]=new Ball();
			
			//sets the size of the ball to 25
			ballArray[i].setSize(25);
			
			//sets position of each ball a certain width apart (varies by i)
			ballArray[i].setPosition(40*i+20, 20*i+20);
		}

	}

	//this method runs over & over again as long as program is still running
	public void draw(){
		
		//clears background so there is no "trail" left when the ball drops
		background(0,20,130);
		
		//iterates through each Ball() in the array and changes its position using drop() method if the mouse is pressed
		for (int i=0; i<ballArray.length; i++) {
			if (mousePressed) {
				ballArray[i].drop();
			} 
			//creates the image of the ball itself in processing
			ellipse((ballArray[i].getXPosition()), (ballArray[i].getYPosition()), (ballArray[i].getSize()), (ballArray[i].getSize()));
		}
	}
}