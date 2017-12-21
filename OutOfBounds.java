// Name: Nanako Chung
// Date: May 2nd, 2017
// Description: program asks the user for an index and determines whether it is in the range of possible indexes in the array

//allows for use of Scanner class
import java.util.*;

//class
public class OutOfBounds {

	//main method
	public static void main(String[] args) {
		
		//creates an array of 100 integers
		int[] array=new int[100];
		
		//initializes the array with randomly assigned integers (between 0-9)
		for (int i=0; i<array.length; i++){
			array[i]=(int)(Math.random()*10);
		} 
		
		//calls the Scanner class
		Scanner input = new Scanner(System.in);
		//asks the user to enter an index
		System.out.print("Enter an index: ");
		int index=input.nextInt();
		//calls the validIndex method
		validIndex(index);
		
	} 
	//validIndex method that returns the value of the index if its valid and returns an exception if index is invalid
	public static void validIndex(int index) throws ArrayIndexOutOfBoundsException{
		if (0<=index && index<100){
			System.out.println(index);
		} else {
			throw new ArrayIndexOutOfBoundsException("Index entered is not within proper range");
		}
	}
}
