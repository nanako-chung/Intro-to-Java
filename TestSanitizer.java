// Name: Nanako Chung
// Date: April 10th, 2017
// Description: Program invokes a class called Sanitizer that sanitizes data input

public class TestSanitizer {

	//main method
	public static void main(String[] args) {
		
		//assigns an "unsanitized" string to the reference variable unsanitized
		String unsanitized="Hello# my name is !Nanako*, and I $love% to eat&!.";
		
		//displays the sanitized string to the user
		System.out.println(Sanitizer.sanitize(unsanitized));
	}

}
