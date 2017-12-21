// Name: Nanako Chung
// Date: April 10th, 2017
// Description: Program contains a class called Sanitizer that sanitizes data input

//public class Sanitizer
public class Sanitizer {
	
	//default constructor
	private Sanitizer() {
	}
	
	//public method so we can reference it without making an instance of the class
	public static String sanitize(String unsanitized) {
		
		//replaces every "dirty" character with an empty string, thereby removing it 
		unsanitized=unsanitized.replace("#","");
		unsanitized=unsanitized.replace("!","");
		unsanitized=unsanitized.replace("*","");
		unsanitized=unsanitized.replace("$","");
		unsanitized=unsanitized.replace("%","");
		unsanitized=unsanitized.replace("&","");
		
		//returns the clean string
		return unsanitized;
	}
}
