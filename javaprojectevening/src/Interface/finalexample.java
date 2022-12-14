package Interface;

final class Test
{
	final int a =10;
	
	final void m1() 
	{
	  //a =20; // not valid because of a final keyword
		System.out.println(a);
	}
}

//class Test123 extends Test // not valid because test id=s final class
//{
	/* void m1()  // not valid because m1 is final method
	{
		System.out.println(a);
	}*/
//}

public class finalexample {
	
	public static void main(String[] args) {
	
		Test co =new Test();
			co.m1();	
		
	}

}
