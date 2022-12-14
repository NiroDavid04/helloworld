package Arrays;

public class Twodimentionarray {

	public static void main(String[] args) {

	/*	int a[][] = new int[3][2]; //declaration of two dimension array
		// storing elements into the array
		a[0][0] = 10;
		a[0][1] = 20;
		
		a[1][0] = 30;
		a[1][1] = 40;
		
		a[2][0] = 50;
		a[2][1] = 60; */
		
		int a[][] = { {10,20},{30,40},{50,60}};
		
		// classical for loop
		
	/*	for(int i=0; i <= 2; i++ ) {   //for incrementing row
			for(int j =0 ; j <=1 ; j++) {  //for incrementing column
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		} */
				
		// for.... each loop
		
		for(int i[]:a) {  // first we assign dummy array to store first row data
			for(int j :i) { // the use that dummy array to print the values
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

}
