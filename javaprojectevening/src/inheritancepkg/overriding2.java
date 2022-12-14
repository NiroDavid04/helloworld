package inheritancepkg;

class vehicle
{
	void run() 
	{
		System.out.println("Vehicle is running");
	}
}

class bike extends vehicle
{
	void run()
	{
		System.out.println("bike is running");
	}
}



public class overriding2 {

	public static void main(String[] args) {
		
		vehicle objv = new vehicle();
		objv.run();
		
		bike objb = new bike();
		objb.run();
		

	}

}
