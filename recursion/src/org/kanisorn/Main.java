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
		// factorial
		System.out.println("1!  = " + factorial(1));
		System.out.println("2! = " + factorial(2));
		System.out.println("3! = " + factorial(3));
		System.out.println("4! = " + factorial(4));
		System.out.println("5! = " + factorial(5));
		System.out.println("6! = " + factorial(6));
		
		// sum of array
		int [] array = {2, 4, 6, 8, 10};
		System.out.println("sum of 2 to 10, seed 2 is " + findSum(array, 5));
		
		// min of array
		array = new int[]{2, 4, 6, 8, 10};
		System.out.println("min of array is " + findMin(array, 5));
		array = new int[]{2, 4, 0, 8, 10};
		System.out.println("min of array is " + findMin(array, 5));
		array = new int[]{2, 4, 6, 8, 0};
		System.out.println("min of array is " + findMin(array, 5));
		
		
	}
	
	// write a recursive function that computes the factorial of n, where n is given as parameter
	public static int factorial(int n) {
		if (n == 0) {
			return 1;
		} else {
			return n * factorial(n - 1);
		}
	}
	
	// write a recursive function that computes the sum of all numbers from 1 to n, where n is given as parameter
	public static int sum(int n) {
		if (n == 1) {
			return 1;
		} else {
			return n + sum(n - 1);
		}
	}
	
	// write a recursive function that finds and returns the minimum element in an array, where the array are given as parameters
	public static int findMin(int [] array, int n) {
		if (n == 1) {
			return array[n - 1];
		}
		else {
			if (array[n - 1] <= findMin(array, n - 1)) {
				return array[n - 1];
			}
			else {
				return findMin(array, n - 1);
			}
		}
	}
	
	// write a recursive function that computes and returns the sum of all elements in an array, where the array and its size are given as parameters
	public static int findSum(int [] array, int n) {
		if (n == 1) {
			return array[n - 1];
		} else {
			return array[n - 1] + findSum(array, n - 1);
		}
	}
}
