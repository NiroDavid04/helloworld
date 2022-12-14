package Loops;

public class Breakstatement {

	public static void main(String[] args) {
		// usage of break
		for(int i=1; i <= 10; i++) {
			if (i==5) {
				break; // stop the loop this condition
			}
			System.out.println(i);
		}
	}

}
