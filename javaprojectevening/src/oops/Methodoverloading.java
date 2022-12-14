package oops;

public class Methodoverloading {

	int a;
	int b;
	
	void sum() // first method
	{
		a =10;
		b = 20;
		System.out.println(a+b);
	}
	
	void sum(int x , int y) // second   // void sum(int a, int b)
	{
		a = x;        //this.a =a;    //we can use this keyword when the above values similar to initial values
		b = y;        // this.b =b;
		System.out.println(a+b);
	}
	
	void sum ( int x,  int y, int z) // third
	{
		System.out.println(x+y+z);
	}
	
	void sum(int x, double y) // fourth
	{
		System.out.println(x+y);
	}
	
	public static void main(String args[]) {
		
		Methodoverloading m1 =  new Methodoverloading(); 
		m1.sum();  // call the first method
		m1.sum(50,40); //   call the second method
		m1.sum(78,69,42);  //call the third method
		m1.sum(45,25.568); // call the fourth method
	}
}
