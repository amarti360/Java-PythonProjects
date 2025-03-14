package projectAnn;

import java.util.Scanner;

public class NameString {
	
	int space;
	String firstName;
	String lastName;

	public static void main(String[] args) {
		Scanner name = new Scanner(System.in);
		System.out.println("Please enter your first name and last name, separated by a space.");
		System.out.println("? ");
		String userName = name.nextLine();
		
		int space = userName.indexOf(' ');
		//int nameLength = userName.length();
		//System.out.println(nameLength);
		String firstName = userName.substring(0, space);
		String lastName = userName.substring(space + 1);
		
		System.out.println("Your first name is " + firstName + ", which has " + firstName.length() + " characters.");
		System.out.println("Your last name is " + lastName + ", which has " + lastName.length() + " characters");
		System.out.println("Your initials are " + firstName.charAt(0) + lastName.charAt(0));
		
		
		
		
	}

}
