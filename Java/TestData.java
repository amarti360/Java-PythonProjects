package projectAnn;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestData {
	public static void main(String[] args) throws FileNotFoundException {
	Scanner scan = new Scanner(new File("src/projectAnn/testdata.txt"));
	String line1 = scan.nextLine();
	int line2 = scan.nextInt();
	int line3 = scan.nextInt();
	int line4 = scan.nextInt();
	
	double average = (line2 + line3 + line4)/3;
	
	System.out.printf("The average grade for " + line1 + "was " + average + ".");
	System.out.println();
	
	
	
	
	}

}
