package Arrays;

public class FirstArray {

	public static void main(String[] args) {
		
		int num[] = new int[5]; // declaration of array with 5 elements
		
		// store the element into array
		num[0] = 10;
		num[1] = 20;
		num[2] = 30;
		num[3] = 40;
		num[4] = 50;
		
	/*	// read the element from an array
		for(int i=0; i <=4; i++) {
		System.out.println(a[i]);
		}  */
		
		// for.... each loop
		
		for (int x : num)
		{
			System.out.println(x);
		} 
	}

}
