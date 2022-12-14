package Arrays;

public class secondArry {

	public static void main(String[] args) {
		
		int a[] = { 100,200,300,400,500}; // we can store any number of element
		
		int sum =0;
		for(int i:a) {
			System.out.println(i);
			sum = sum +i;
		}
		
     System.out.println("total amount:" + sum);
    
	}

}
