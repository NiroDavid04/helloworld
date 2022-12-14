package inheritancepkg;

class A
{
	int a;
	int b;
	
	void display()
	{
		System.out.println(a+b);
	}
}

class B extends A  // using the extends inheritance we are able to access class A
{
	int x;
	int y;
	
	void show()
	{
		System.out.println(x+y);
	}
}


class C extends B 
{
	int p;
	int q;
	
	void addition()
	{
		System.out.println(p+q);
	}
}



public class Test {

	public static void main(String[] args) {
	
	/*  A aobj = new A(); // normally create object and assign variable values then print
		aobj.a = 100;
		aobj.b = 200;
		aobj.display(); */
	
	/*	B bobj = new B();  // single inheritance
		bobj.x = 50;
		bobj.y = 70;
		bobj.show();
		
		bobj.a = 100;
		bobj.b = 200;
		bobj.display();  */
		
		C cobj = new C();  // multi level inheritance
		cobj.a = 100;
		cobj.b = 200;
		cobj.x = 300;
		cobj.y = 400;
		cobj.p = 500;
		cobj.q = 600;
		
		cobj.display();
		cobj.show();
		cobj.addition();
		
	}

}
