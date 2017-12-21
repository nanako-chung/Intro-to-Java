/// Name: Nanako Chung
// Date: April 24th, 2017
// Description: The program creates the Enemy class based on the given UML

public class Enemy {
	
	//private data fields specified on the UML
	private int xPos;
	private int yPos;
	private int health;
	
	//default constructor with correct specifications
	Enemy() {
		this.xPos=100;
		this.yPos=50;
		this.health=100;
	}
	
	//constructor with parameters xPos and yPos
	Enemy(int xPos, int yPos){
		this.xPos=xPos;
		this.yPos=yPos;
	}
	
	//constructor with parameters xPos, yPos, and health
	Enemy(int xPos, int yPos, int health) {
		this.xPos=xPos;
		this.yPos=yPos;
		this.health=health;
	}
	
	//method called hit that deducts 10 from health by default
	public void hit(){
		health-=10;
	}
	
	//method with parameters that reduces the health by requested amount
	public void hit(int amount){
		health-=amount;
	}
	
	//method that sets X position to requested place
	public void setX(int xPos){
		this.xPos=xPos;
	}
	
	//method that sets Y position to requested place
	public void setY(int yPos){
		this.yPos=yPos;
	}
	
	//method that returns the current X position
	public int getX(){
		return xPos;
	}
	
	//method that returns the current Y position
	public int getY(){
		return yPos;
	}
	
	//method that returns the current health of object
	public int getHealth(){
		return health;
	}
}
