package week1.day2;

public class FibonacciSeries {
	
	public static void main(String[] args) {
		
		//initialize 3 int variable (Tip: range= 8, firstNum= 0, secNum= 1, sum in the series)
		int range = 8, firstNum = 0, secNum = 1;
		int sum ;
		
		// Print first number
	    // System.out.printIn(firstNum );
		
		// Iterate from 1 to the range
		for (int i = 1; i<= range; i++) {
			
			//Print first number
			System.out.println(firstNum );
			
			//add first and second number assign to sum
			sum = firstNum + secNum;
			
			//Assign second number to the first number
			firstNum = secNum;
			
			//Assign sun to the second number
			secNum = sum;
		}
		
		
	
	}

}
