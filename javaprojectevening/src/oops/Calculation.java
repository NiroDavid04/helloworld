package oops;

public class Calculation {

	int a; 
	int b;
	
	// 1 - method may not takes parameters - empty parameter
	// similarly below method may not return the values
	/*void sum()
	{
	System.out.println(a+b);	
	}*/
	
	
	// 2 - method takes parameters
	/*void sum (int x , int y) 
	{
	a=x;
	b=y;
	System.out.println(a+b);
	}*/
	
	// 3- a method return some values
	int sum()
	{
		return(a+b);
	}

	
	public static void main(String args[]) {
		Calculation cal = new Calculation();
		
		// 1 - method may not takes parameters - empty parameter
		// similarly below method may not return the values
		/*cal.a = 100;
		cal.b = 200;
		cal.sum(); */
		
		// 2 - method takes parameters
		//cal.sum(100, 200);
		
		
		// 3- a method return some values
		cal.a = 128;
		cal.b = 586;
		int r = cal.sum();
		System.out.println(r);
		
		
	}
}
