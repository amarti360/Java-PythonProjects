package projectAnn;

public class Dice {
	/* This program simulates rolling a pair of dice.  The number that comes up on each die is output, followed
	   by the total of the two dice.
	*/

	public static void main(String[] args) {
		int dice1 = (int)(Math.random()*6) + 1;
		System.out.println("The first dice comes out as " + dice1);
		int dice2 = (int)(Math.random()*6) + 1;
		System.out.println("The second dice comes out as " + dice2);
		int sum = dice1 + dice2;
		System.out.println("Your total roll is " + sum);

	} // end main()

} // end class Dice
