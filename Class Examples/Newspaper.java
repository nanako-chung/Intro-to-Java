import java.util.*;

public class Newspaper {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input=1; 

		ArrayList<Integer> list=new ArrayList<Integer>();

		while (input!=0) {
			System.out.print("");
			input = sc.nextInt();
			if (input!=0 && input<2000000000 && input>0) {
				list.add(input);
			}
		} 

		System.out.println();

		for (int i=0; i<list.size(); i++) {
			int n = list.get(i);
			if (n<10) {
				System.out.println(n);
			} else if (n>=10 && n<=99) {
				int newN1=n/10+n%10;
				if (newN1>=10) {
					newN1=modAgain(newN1);
				}
				System.out.println(newN1);
			} else if (n>=100 && n<=999) {
				int newN2=n/100+(n%100)/10+(n%10);
				if (newN2>=10) {
					newN2=modAgain(newN2);
				}
				System.out.println(newN2);
			} else if (n>=1000 && n<=9999) {
				int newN3=n/1000+(n%1000)/100+(n%100)/10+(n%10);
				if (newN3>=10) {
					newN3=modAgain(newN3);
				}
				System.out.println(newN3);
			} else if (n>=10000 && n<=99999) {
				int newN4=n/10000+(n%10000)/1000+(n%1000)/100+(n%100)/10+(n%10);
				if (newN4>=10) {
					newN4=modAgain(newN4);
				}
				System.out.println(newN4);
			} else if (n>=100000 && n<=999999) {
				int newN5=n/100000+(n%100000)/10000+(n%10000)/1000+(n%1000)/100+(n%100)/10+(n%10);
				if (newN5>=10) {
					newN5=modAgain(newN5);
				}
				System.out.println(newN5);
			} else if (n>=1000000 && n<=9999999) {
				int newN6=n/1000000+(n%1000000)/100000+(n%100000)/10000+(n%10000)/1000+(n%1000)/100+(n%100)/10+(n%10);
				if (newN6>=10) {
					newN6=modAgain(newN6);
				}
				System.out.println(newN6);
			} else if (n>=10000000 && n<=99999999) {
				int newN7=n/10000000+(n%10000000)/1000000+(n%1000000)/100000+(n%100000)/10000+(n%10000)/1000+(n%1000)/100+(n%100)/10+(n%10);
				if (newN7>=10) {
					newN7=modAgain(newN7);
				}
				System.out.println(newN7);
			} else if (n>=100000000 && n<=999999999) {
				int newN8=n/100000000+(n%100000000)/10000000+(n%10000000)/1000000+(n%1000000)/100000+(n%100000)/10000+(n%10000)/1000+(n%1000)/100+(n%100)/10+(n%10);
				if (newN8>=10) {
					newN8=modAgain(newN8);
				}
				System.out.println(newN8);
			} else {
				int newN9=n/1000000000+(n%1000000000)/100000000+(n%100000000)/10000000+(n%10000000)/1000000+(n%1000000)/100000+(n%100000)/10000+(n%10000)/1000+(n%1000)/100+(n%100)/10+(n%10);
				if (newN9>=10) {
					newN9=modAgain(newN9);
					if (newN9>=10) {
						newN9=modAgain(newN9);
					}
				}
				System.out.println(newN9);
			}
		} 
	}

	public static int modAgain(int num) {
		int newNum=(int) Math.floor(num/10)+(num%10);
		return newNum;
	}
}