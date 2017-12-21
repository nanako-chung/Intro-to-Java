/// Name: Nanako Chung
// Date: April 24th, 2017
// Description: Below is another subclass called Level2Enemy that inherits the Enemy class and establishes a default health and a method called fire()

//subclass that inherits Enemy class
public class Level2Enemy extends Enemy {
	
	//no arg constructor that sets up an object with default health 200
	Level2Enemy(){
		super(100,50,200);
	}
	
	//method called fire that prints PEW PEW
	public void fire(){
		System.out.println("PEW PEW");
	}
}