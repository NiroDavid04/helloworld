package oops;

public class Employee {

	int empid;  // variables
	String empname;
	int salary;
	int deptno;
	
	/*Employee(int id, String name, int sal, int dno) //constructor
	{
		empid = id;
		empname = name;
		salary =  sal;
		deptno = dno;
	}*/
	
	
	void setdata(int id, String name, int sal, int dno) {   // using method easily input values
		empid =id;
		empname = name;
		salary = sal; 
		deptno = dno;
	}
	
	void display() //method print the variable
	{
		System.out.println(empid);
		System.out.println(empname);
		System.out.println(salary);
		System.out.println(deptno);
	}
	
	public static void main(String args[]) { //main method
		
		
	// Assigning value to class variables using objective - First method 
		
	/*	Employee emp1 = new Employee(); //first employee object1
		emp1.empid = 101;
		emp1.empname = "Niroshan";
		emp1.salary = 20000;
		emp1.deptno = 10;
		emp1.display();
		
		Employee emp2 = new Employee(); //second employee object2
		emp2.empid = 145;
		emp2.empname = "Johnson";
		emp2.salary = 24500;
		emp2.deptno = 12;
		emp2.display();  */
		
		// Assigning value to class variable using constructor -Second method
		
		/* Employee emp1 = new Employee(101, "Niro", 20000, 10);
		emp1.display();
		
		Employee emp2 = new Employee(102, "Niru",50000, 15);
		emp2.display();
		*/
		
		// Assigning values to class variable using method - third method
		
		Employee emp1 =new Employee();
		emp1.setdata(101, "Niro", 20000, 10);
		emp1.display();
		
		Employee emp2 =new Employee();
		emp2.setdata(102, "dawyne", 50000, 15);
		emp2.display();
	}
	
	
}
