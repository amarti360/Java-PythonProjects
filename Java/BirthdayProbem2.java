package projectAnn;

public class BirthdayProbem2 {
	/**
	 * Simulate choosing people at raondom and checking the day of the year they were born on.  The number of different
	 * days found among 365 people is counted and output.
	 */
	public static void main(String[] args) {
		boolean used[]; // used[i] will be true if a person is found and whose birthday is on the i-th day of year.
		
		used = new boolean[365]; // Initially, all entries are false.
		
		/* Chose 365 days at random, and make each day by setting the corresponding entry in the array, used, to
		   true.  (If the value is already true, it doesn't matter.  We are only interested in whether or not the
		   birthday occurs, not how many times it occurs.)
		*/
		
		int i;
		for (i = 0; i < 365; i++) {
			int birthday;
			birthday = (int)(Math.random()*365);
			used[birthday] = true;
		}
		
		/* Now count how many entries in the used array are true.  This is how many different birthdays were found.
		*/
		
		int count = 0;
		int day;
		
		for (day = 0; day < 365; day++) {
			// If this day occurred as a birthday, count it.
			if (used[day] == true)
				count++;
		}
		System.out.println("Among 365 people, there were " + count + " different birthdays.");
	
		}

	} // end class BirthdayProblem2

