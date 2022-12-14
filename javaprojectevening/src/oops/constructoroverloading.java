package oops;

public class constructoroverloading {
	
	int a =0;
	int b = 0;
	double c = 0;
	
	constructoroverloading() // first
	 {
		 a = 40;
		 b = 30;
		 c = 20.5;
	 }
	
	 constructoroverloading(int x, int y) //second   // constructoroverloading(int a, int b) 
	 {
		a=x;      //this.a=a;
		b=y;    //this.b=b;
	 }
	
	 constructoroverloading(int x, double y) //third
	 {
		 a=x;
		 c=y;
	 }
	
	 constructoroverloading( int x , int y , double z) // fourth
	 {
		 a=x;
		 b=y;
		 c=z;
	 }
	 
	 constructoroverloading( int x , double y , int z) // fifth just swap parameter places
	 {
		 a=x;
		 b=z;
		 c=y;
	 }
	 
	
	 void display() {
		 System.out.println(a);
		 System.out.println(b);
		 System.out.println(c);
	 }
	 
	

	public static void main(String[] args) {
		//constructoroverloading co =new constructoroverloading(); // call the first constructor
		//constructoroverloading co =new constructoroverloading(25,50); // call the second constructor
		//constructoroverloading co =new constructoroverloading(25,20.55); // call the third constructor
		//constructoroverloading co =new constructoroverloading(25,30,20.5); // call the fourth constructor
		constructoroverloading co =new constructoroverloading(25,21.5,20); 
		// call fifth but printing will similar to forth
	
		co.display();

	}

}
