package projectAnn;

import java.util.Scanner;


public class Eggs {

	public static void main(String[] args) {
		Scanner egg = new Scanner(System.in);
		int eggs;
		int gross; 
		int aboveGross;
		int dozens;
		int extras;
		
		System.out.println("How many eggs do you have? ");
		eggs = egg.nextInt();
		
		gross = eggs / 144;
		aboveGross = eggs % 144;
		
		dozens = aboveGross / 12;
		extras = aboveGross % 12;
		
		System.out.print("You number of eggs is ");
		System.out.print(gross);
		System.out.print(" gross, ");
		System.out.print(dozens);
		System.out.print(" dozen, and ");
		System.out.print(extras);
		System.out.println();
		
	}

}
