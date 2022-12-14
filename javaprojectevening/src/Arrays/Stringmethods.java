package Arrays;

public class Stringmethods {
	public static void main(String[] args) {
		
	 //length - return the length of the string
		String a ="Welcome";
		System.out.println(a.length()); // 7 number of character in the string
		
		
		// concatenation - join the string
		
		String s1 = "Welcome to";
		String s2 = " tranning";
		
		System.out.println(s1+s2);
		System.out.println(s1.concat(s2));
		System.out.println("Welcome to" + " tranning");
		System.out.println("Welcome to".concat(" tranning"));
		
		//equals - comparing two strings
		
		String s3 = "WELCOME";
		String s4 = "welcome";
		
		System.out.println(s3.equals(s4)); // false  // because java is case sensitive
		System.out.println(s3.equalsIgnoreCase(s4)); //True
		
		// contains -  check whether String contains that character or not
		
		System.out.println(s3.contains("WEL"));
	
		// substring - use to extract the the sub string or characters from main string
		// Substring(Starting index, Ending index)
		
		System.out.println(s3.substring(0,4)); //WELC
		System.out.println(s3.substring(2,4)); //LC
		
		//Replace
		System.out.println(s4.replace("e", "a"));
		System.out.println(s4.replace("come", "play"));
	}
}
