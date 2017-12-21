// Name: Nanako Chung
// Date: Feb 16th, 2017
// Description: I created a program that asks a user for a string and tells the user whether it is a palindrome or not

// allows for the use of Scanner class
import java.util.Scanner;

public class AManAPlanACanalAPanama {

	// main method
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// asks user for a string to check and declares their input as the variable 'UserString'
		System.out.print("Enter a string to check if it's a palindrome: ");
		String UserString = input.nextLine();
		
		// calls for palindrome method
		palindrome(UserString);
	}

	// method that takes in a string and returns the reverse of that string
	public static String reverse(String UserString) {
		// creates an empty string for the reverse word
		String reverseString="";
		
		// iterates over every letter starting from the last and ending at the first and adds on to the empty string 'reverseString'
		for (int i=UserString.length()-1; i>=0; i--) {
			reverseString+=UserString.charAt(i);
			
		// returns the reversed word
		} return reverseString;
	}

	// method that checks whether or not string is a palindrome
	public static void palindrome(String UserString) {
		
		// uses reverse method (created above) to output the reverse of a word
		String reverseString = reverse(UserString);
		
		// if the reversed word is the same as the user's input, the word is a palindrome!
		if (UserString.equals(reverseString)) {
			System.out.println(reverseString+" is, in fact a palindrome");
		} else {
			System.out.println(UserString+" is not a palindrome");
		}
	}
}