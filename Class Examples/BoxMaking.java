import java.util.*;

public class BoxMaking {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		System.out.println("Width: ");
		int width = input.nextInt();
		System.out.println("Height: ");
		int height = input.nextInt();
		System.out.println();
		boxMaking(height,width);
	}

	public static void boxMaking(int height, int width) {
		String [][] box=new String[height][width];
		for (int row=0; row<box.length; row++) {
			for (int col=0; col<box[row].length; col++) {
				if (row==0 || row==box.length-1) {
					if (col==0 || col==box[row].length-1) {
						box[row][col]="o";
					} else {
						box[row][col]="-";
					}
				} else {
					box[row][col]="-";
				}
			}
		} for (int row=0; row<box.length; row++) {
			for (int col=0; col<box[row].length; col++) {
				System.out.printf("%3s ", box[row][col]);
			} System.out.println();
		} 
	}
}
