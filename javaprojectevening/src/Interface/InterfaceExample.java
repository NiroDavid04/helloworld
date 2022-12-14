package Interface;

interface Testinter{
	
	int a =10; //by default variable is static and final
	void display(); //abstract method by default infront of void have a public
}

public class InterfaceExample implements Testinter { //here use implement to declare the subclass of interface
	public void display()  // if you did not put public by default it take default modifier
	{
		System.out.println(a);
	}
	

	public static void main(String[] args) {
		
		Testinter co = new InterfaceExample();
		//InterfaceExample co = new InterfaceExample();
		co.display();

	}

}
