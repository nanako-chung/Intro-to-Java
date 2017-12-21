/// Name: Nanako Chung
// Date: April 24th, 2017
// Description: Game test class that utilizes the Enemy class and the Level1Enemy and Level2Enemy subclasses

//test class
public class Game {

	//main method
	public static void main(String[] args) {
		
		//creates an instance of each class
		Enemy myEnemy=new Enemy();
		Level1Enemy myLev1En=new Level1Enemy();
		Level2Enemy myLev2En=new Level2Enemy();
		
		//hits each class with a random integer
		myEnemy.hit((int)(Math.random()*101));
		myLev1En.hit((int)(Math.random()*151));
		myLev2En.hit((int)(Math.random()*201));
		
		//prints out health of each class
		System.out.println("Health for Enemy: "+myEnemy.getHealth());
		System.out.println("Health for Level 1 Enemy: "+myLev1En.getHealth());
		System.out.println("Health for Level 2 Enemy: "+myLev2En.getHealth());
		
		//calls the move method on the Level1Enemy object
		myLev1En.move();
		
		//prints out x & y position of myLev1En
		System.out.println("X Position of Level 1 Enemy: "+myLev1En.getX()+"\n"+"Y Position of Level 2 Enemy: "+myLev1En.getY());
		
		//calls the fire method on the Level2Enemy object
		myLev2En.fire();
	}
}
