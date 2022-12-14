package oops;

public class Staticexample {

	int a;  //non static variable
	static int b;  // static variable
	
	
	static void m1()
	{
		System.out.println("This is m1-static method");
	}
	
	
	void m2() 
	{
		System.out.println("This is m2-non static method");
	}
	
	void m3()
	{
		a = 200;  //non static variable
		b = 500; // Static variable
		
		m2(); // non-static method
		m1(); // static method
	}
	
	
	public static void main(String[] args) {
		// static method can access static stuff only
		b=100;
		System.out.println(b);
		m1();
		
		// a=200; // not accessible because this not a static variable
		// m2(); // not accessible because this not a static method
		
		Staticexample co = new Staticexample();
		co.a = 200;
		System.out.println(co.a);
		co.m2();
	}

}
