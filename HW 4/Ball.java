//Name: Nanako Chung
//Date: March 27th, 2017
//Description: creates an animation of an array of balls!

// creates the public class called Ball
public class Ball {
	
	//required private data fields
	private int size;
	private int xPos=0;
	private int yPos=0;
	
	//creates public constructor Ball()
	public Ball() {
	}
	
	//creates a public method that sets the preferred size of the ball using private data field size
	public void setSize(int newSize) {
		size=newSize;
	}
	
	
	//creates a public method that sets the x and y positions of the ball as preferred using the private data fields
	public void setPosition(int x, int y) {
		xPos=x;
		yPos=y;
	}
	
	//creates a public method that gets the x position
	public int getXPosition() {
		return xPos;
	}
	
	//creates a public method that gets the y position
	public int getYPosition() {
		return yPos;
	}
	
	//creates a public method that gets the size of the ball (will be the radius of the ellipse)
	public int getSize() {
		return size;
	}
	
	//creates a public method that drops the ball one pixel at a time
	public void drop() {
		int newYPos=getYPosition()+1;
		setPosition(xPos,newYPos);
	}
}
