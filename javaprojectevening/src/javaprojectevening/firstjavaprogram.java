package javaprojectevening;

public class firstjavaprogram {
	public static void main (String args[]) {
		System.out.println("This my life changing moment");
		
		// Arithmetic operators
		
		int a = 10;
		int b = 20;
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		
		// rational operators
		
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a>=b);
		System.out.println(a<=b);
		System.out.println(a==b);
		System.out.println(a!=b);
		
		// logical operator
		
		boolean x= true;
		boolean y= false;
		
		System.out.println(x && y);
		System.out.println(x || y);
		System.out.println(!x);
		System.out.println(!y);
		
		// assignment operators
		
		int c;
		c=a;
		System.out.println(c);
		c=b;
		System.out.println(c);
		
		// increment and decrement operator
		
		c = 100;
		//c++; // c= c+1
		//System.out.println(c);
        //c--;  //c=c-1
		//c += 5; // c=c+5
		c -= 5; // c=c-5        System.out.println(c);
	
	}
}
