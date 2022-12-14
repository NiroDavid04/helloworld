package Arrays;

public class Objectarray {
	public static void main(String[] args) {
		Object a[] = new Object[5];
		a[0] = 10;
		a[1] = 23.34;
		a[2] = "good";
		a[3] = 'D';
		a[4] = true;
		
		for(Object i:a) {
			System.out.println(i);
		}
		
	}
}
