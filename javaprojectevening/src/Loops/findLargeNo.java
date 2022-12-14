package Loops;

public class findLargeNo {

	public static void main(String[] args) {
		// Find a Large number into three integers
		int a = 10;
		int b =120;
		int c= 30;
		
		if((a>b) && (a>c)) {
			System.out.println("Largest number is a :" +a);
		} 
		
		else if ((b>a) && (b>c)) {
			System.out.println("Largest number is b :" +b);
		}
		else {
			System.out.println("Largest number is c :" +c);
		}

	}

}
