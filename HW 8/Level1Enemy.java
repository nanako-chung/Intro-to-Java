/// Name: Nanako Chung
// Date: April 24th, 2017
// Description: The program creates a subclass of Enemy class called Level1Enemy and sets up speed an default health as well as a method called move()

//subclass that inherits Enemy class
public class Level1Enemy extends Enemy {
	
	//sets up private data field
	private int speed;
	
	//no arg constructor with default speed 1 and default health 150
	Level1Enemy(){
		super.Enemy(100,50,150);
		this.speed=1;
	}
	
	//method called move() that increases the x position by the speed amount every time it is called
	public void move(){
		setX(getX()+speed);
	}
}
