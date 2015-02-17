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
		int [] array = {1};
		System.out.println(largestAdjacentSum(array));
		
		array = new int[] {1, 2, 3, 4};
		System.out.println(largestAdjacentSum(array));
		
		array = new int[] {18, -12, 9, -10};
		System.out.println(largestAdjacentSum(array));
		
		array = new int[] {1,1,1,1,1,1,1,1,1,1,1};
		System.out.println(largestAdjacentSum(array));
		
		array = new int[] {1,1,1,1,2,1,1,1,1,1,1};
		System.out.println(largestAdjacentSum(array));
		
		
		
	}
	
	// largestAdjacentSum
	public static int largestAdjacentSum(int a[]) {
		int largest=0;
		
		for (int i=0; i<a.length-1; i++) {
			if (i==0) {
				largest = a[i] + a[i+1];
			} else {
				if (largest < a[i]+a[i+1])
					largest = a[i]+a[i+1];
			}
		}
		return largest;
	}

	// 
	public static int isSequencedArray(int[ ] a, int m, int n) {
		int size = Math.abs((n - m) + 1);
		int [] array = new int[size];
		for (int i=a.length-1; i>=0; i--){
			array[i] = n;
			n--;
		}
		
		int found = 0;
		for (int i=0; i<array.length; i++) {
			for (int j=0; j<a.length; j++) {
				if (array[i]==a[j]) {
					found = 1;
					continue;
				}
					
			}
		}
		
		
		return found;
	}

}
