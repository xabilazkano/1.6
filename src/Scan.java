import java.util.Scanner;
public class Scan {

	public static void main(String[] args) {
		
		//First of all we will create the scanner
		Scanner proba = new Scanner (System.in);

		//This will find the first line and print it
		System.out.println("Enter your name and surname");
		System.out.println(proba.nextLine()); 
		
		//This will find the next token and print it
		System.out.println("Enter your name and surname");
		System.out.println(proba.next());
		
		//If there are more tokens this will print them
		if (proba.hasNext()) {
			System.out.println(proba.next());
		}
		
		//Finally this will find a boolean 
	    System.out.println("Are you of legal age? (Answer true or false)");
	    boolean b = proba.nextBoolean();
	    if (b==true) {
	    System.out.println("Everything okay");
	}
	    else {
	    	System.out.println("Go back");
	    }
	}

}
