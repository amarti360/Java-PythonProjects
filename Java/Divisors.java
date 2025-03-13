package projectAnn;

public class Divisors {
/* This program finds the interger between 1 and 10000 that has the largest number of divisors.
   It print out the maximum number of divisors and an integer that has that many divisors.
  */

	public static void main(String[] args) {
		int N;
		int maxDivisors;
		int numWithMax;
		
		maxDivisors = 1;
		numWithMax = 1;
		
		for (N =2; N <= 10000; N++) {
			int D;
			int divisorCount;
		
			divisorCount = 0;
			
			for (D = 1; D <= N; D++) {
				if (N % D == 0)
					divisorCount++;
			}
				
			if (divisorCount > maxDivisors) {
				maxDivisors = divisorCount;
				numWithMax = N;
			}
		}
	
	System.out.println("Among integers between 1 and 10000, the maximum number of divisors is " + maxDivisors);
	System.out.println("A number with " + maxDivisors + " divisors is " +numWithMax);
	}
} // end class Divisors


		

	
	

		
	
		
