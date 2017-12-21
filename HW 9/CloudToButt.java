// Name: Nanako Chung
// Date: May 2nd, 2017
// Description: program takes data from the web and places it into a file

//imports all necessary java classes
import java.util.*;
import java.net.*;
import java.io.*;

public class CloudToButt {
	//main method
	public static void main(String[] args) throws Exception{
		//does not create file, but creates an object file
		File file = new File("butt_article.txt");
		
		//allows us to start writing in the file
		PrintWriter output = new PrintWriter(file);

		try{
			//creates URL object that references the link with the cloud article
			URL url = new URL("http://cs.nyu.edu/courses/spring16/CSCI-UA.0101-008/assignments/text/cloud_article.txt");
			
			//creates scanner object to allow us to read the data on the web page
			Scanner urlInput = new Scanner(url.openStream());
			
			//continues to iterate over each line in the article until the last line
			while (urlInput.hasNext()){
				//processes each line and stores data into a string called line
				String line = urlInput.nextLine();
				
				//replaces each cloud with butt
				String newLine=line.replaceAll("Cloud", "Butt");
				String newestLine=newLine.replaceAll("cloud", "butt");
				
				//writes this in the file
				output.println(newestLine);
			} 
			//closes file
			output.close();
		// catches exception of bad URL
		} catch (MalformedURLException e){
			e.printStackTrace();
		}
	}
}
