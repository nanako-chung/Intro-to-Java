// Name: Nanako Chung
// Date: April 10th, 2017
// Description: Program is a test class that experiments with a nonexistent MyTimer class

//test class for MyTimer
public class TestMyTimer {

	//main method
	public static void main(String[] args) {
		
		//creates an instance of MyTimer
		MyTimer timer = new MyTimer();
		
		//creates an accumulator variable to keep track of the sum
		int sum=0;
		
		//calls the start method to start timer
		timer.start();
		
		//iterates through 0-99 and adds each number to the sums
		for (int i=0;i<100;i++) {
			sum+=i;
			
			//displays elapsed time in milliseconds since the last iteration
			System.out.println(getElapsedTimeMillis());
		}
		
		//calls the stop method to stop timer
		timer.stop();
	}
}
