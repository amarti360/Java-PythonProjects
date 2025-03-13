package projectAnn;

import java.util.Scanner;

/**
 * This program will read one line of input typed by the user.
 * It will print the words from the input one word to a line.
 * A word is defined to be a sequence of letters.  All non-letters
 * in the input are discarded.
 */

public class ListWordsString {

	public static void main(String[] args) {
		String line; // A line of text, typed in by the user.
		int i;	     // Position in line, from 0 to line.length() -1.
		char ch;     // One of the characters in line.
		boolean didCR; // Set to true if the previous output was a carriage return.
		
		Scanner word = new Scanner(System.in);
		System.out.println("Enter a line of text.");
		System.out.println("? ");
		String line1 = word.nextLine();
		
		System.out.println();
		didCR = true;
		
		for (i =0; i < line1.length(); i++) {
			ch = line1.charAt(i);
			if (Character.isLetter(ch)) {
				System.out.print(ch);
				didCR = false;
			}
			else {
				if (didCR == false) {
					System.out.println();
					didCR = true;
					
				}
			}
		}
		System.out.println(); // Make sure there's at least one carriage return at the end.

	}

} // end class ListWordsString
