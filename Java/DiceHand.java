package projectAnn;

public class DiceHand {
/* This program simulates rolling a pair of dice until they come up snake eyes.  It reports how many rolls were needed.
*/

	public static void main(String[] args) {
		int die1, die2;
		int countRolls;
		countRolls = 10;
		
		do {
			die1 = (int)(Math.random()*6) + 1;
			die2 = (int)(Math.random()*6) + 1;
			
		} while (die1 != 1 || die2 != 1);
		
		System.out.println("It took " + countRolls + " rolls to get snake eyes.");

	}

} // end class DiceHand
