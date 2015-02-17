/**
 * 
 */
package org.kanisorn;

/**
 * @author kanisorn
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(checkConcatenatedSum(198, 2));
		System.out.println(checkConcatenatedSum(198, 3));
		System.out.println(checkConcatenatedSum(2997, 2));
		System.out.println(checkConcatenatedSum(2997, 3));
		System.out.println(checkConcatenatedSum(9, 1));
		
		System.out.println(countTargetNumber(1999990, 0));
	}
	
	// finding prime number
	public static boolean isPrime(int n) {
		boolean retVal = true;
		
		if (n < 2)
			retVal = false;
		
		for (int i=2; i<n; i++) {
			if (n%i == 0) {
				retVal = false;
				break;
			}
		}
		
		return retVal;
	}
	
	
	public static boolean checkConcatenatedSum(int n, int catLen) {
		
		int num = n;
		int sum = 0;
		int count = (int)Math.log10(num);
		int div = (int) Math.pow(10, count);
		
		for (int i=0; i<=count; i++) {
			int temp = num/div;

			int x = 0;
			int dupper = 1;
			for (int j=0; j<catLen; j++) {
				x += (temp * dupper);
				dupper *= 10;
			}
			sum += x;
			num -= (temp*div);
			div /= 10;
		}
		return n==sum;
	}
	
	public static int countTargetNumber(int number, int digit) {
		if (number < 0 || digit < 0) {
			return 0;
		}
		
		int length = (int)Math.log10(number);
		int count = 0;
		
		for (int i=length; i>=0; i--) {
			int n = number / ((int)Math.pow(10, i));
			
			if (n == digit)
				count++;
			
			number -= (n*((int)Math.pow(10, i)));
			
		}
		
//		if (number == digit)
//			count++;
		
		return count;
		
	}

}
