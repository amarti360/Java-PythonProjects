package projectAnn;

import java.util.Scanner;

public class HelloName {
	/* This program askes the user's name and then greets the user by name.  This program depends on the non-standard class,
	   java.util.Scanner.
	*/

	public static void main(String[] args) {
		Scanner name = new Scanner(System.in);
		System.out.println("What is your name?");
		
		String userName = name.nextLine();
		System.out.println("Hello, " + userName.toUpperCase() + ", nice to meet you!");
		
		
	}

}
