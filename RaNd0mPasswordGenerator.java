/// Name: Nanako Chung
// Date: Feb 7th, 2017
// Description: I created a program that generates a random password everytime it is run!

public class RaNd0mPasswordGenerator {
	
	public static void main(String[] args) {
		
		/// using what I learned from the textbook, to generate a random character, the format used is (char)('ch1' + Math.random()*('ch2'-'ch1'+1)), so I used this to find all the random chars
		char char1 = (char)('a' + Math.random()*('z'-'a'+1));
		char char3 = (char)('A' + Math.random()*('Z'-'A'+1));
		char char4 = (char)('a' + Math.random()*('z'-'a'+1));
		
		// chooses a random integer between 0 and 9 using the Math method
		int char2 = (int)(Math.random()*10);
		int char5 = (int)(Math.random()*10);
		int char6 = (int)(Math.random()*10);

		// adding a string and another datatype converts that datatype to a string; knowing this, I added an empty string to all the different data types to form one big string (the password: pass) with all the chars and ints
		String pass = ("" + char1 + char2 + char3 + char4 + char5 + char6);
	
		// display the generated password
		System.out.println("Generated password: " + pass);
	}
}
