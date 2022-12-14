package Loops;

public class assignment {

	public static void main(String[] args) {
		// swapping the two integers
		int a =10;
		int b=20;
		System.out.println("values of a is before swapping" + a);
		System.out.println("values of b is before swapping" + b);
		
		int c;
		c=a; // now c=10
		a=b; // a is 20
		b=c;
		System.out.println("values of a is after swapping" + a);
		System.out.println("values of b is after swapping" + b);
		
	}

}
