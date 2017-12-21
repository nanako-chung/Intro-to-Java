// Name: Nanako Chung
// Date: Feb 14th, 2017
// Description: I created a program that generates a random pattern using 2 chars that user entered

// allows for the use of Scanner class
import java.util.Scanner;

public class RandomPattern {

	public static void main(String[] args) {
		// calls the Scanner class
		Scanner input = new Scanner(System.in);
		
		// asks the user to enter 2 chars and stores that input into the variable 'characters'
		System.out.print("Please enter 2 characters to use to generate a random pattern: ");
		String characters = input.next();
		
		// creates an empty string called 'pattern' to compile all the characters in the for loop to one big pattern
		String pattern="";
		
		// outer for loop generating the 100 rows
		for (int i=0; i<100; i++) {
			
			// inner for loop generating the characters that make up each row
			for (int j=0; j<100; j++) {
				
				// chooses a random integer between 0 and 1 using the Math method
				int randomindex = (int)(Math.random()*2);
				
				// uses the randomindex to pick either the first or second character that the user first input
				pattern+=characters.charAt(randomindex);
			}
			// allows for the creation of a new row by starting the next for loop to generate on a new line
			pattern+="\n";
		}
		// displays the final random pattern to user
		System.out.print(pattern);
	}
}
