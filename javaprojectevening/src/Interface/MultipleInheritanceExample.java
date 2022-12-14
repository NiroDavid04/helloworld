package Interface;
// multiple interheritance only possible to interfaces
interface A
{
	int a =10;
	void display();
}

interface B
{
	int b =20;
	void show();
}

public class MultipleInheritanceExample implements A,B
{
	public void display()
	{
		System.out.println(a);
	}
	
	public void show()
	{
		System.out.println(b);
	}
	

	public static void main(String[] args) {
		
		 MultipleInheritanceExample m1 = new  MultipleInheritanceExample();
		 m1.display();
		 m1.show();
	}

}
