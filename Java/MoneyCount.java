package projectAnn;

import java.util.Scanner;

public class MoneyCount {

	public static void main(String[] args) {
		Scanner money = new Scanner(System.in);
		System.out.println("How many quarters do you have?");
		int quarters = money.nextInt();
		
		
		System.out.println("How many nickels do you have?");
		int nickels = money.nextInt();
		
		System.out.println("How many dimes do you have?");
		int dimes = money.nextInt();
		
		System.out.println("How many pennies do you have?");
		int pennies = money.nextInt();
		
		double sum = (quarters * 0.25) + (nickels * 0.05) + (dimes * 0.10) + (pennies * 0.01);
		
		System.out.print("You have a total of $" + sum);
		
		

	}

}
