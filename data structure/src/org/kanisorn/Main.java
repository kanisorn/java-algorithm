/**
 * 
 */
package org.kanisorn;

import org.kanisorn.lists.Employee;
import org.kanisorn.trees.BinaryTree;
/**
 * @author kanisorn
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setFirstName("kanisorn");
		emp.setLastName("Hong.");
		
		emp.addEntry("1/15/2006", 3005.50);
		emp.addEntry("2/15/2006", 3150.00);
		emp.addEntry("3/15/2006", 4200.00);
		emp.addEntry("4/15/2006", 2988.50);
		
		emp.printPaymentAmount("1/1/2001");
		emp.printPaymentAmount("1/15/2006");
		emp.printAveragePaycheck();
		
		BinaryTree<String> t = new BinaryTree<String>("Kanisorn");
		t.add("BBB");
		t.add("AAA");
		t.add("CCC");
		t.add("ZZZ");
		
		t.traverseInorder();
		
	}

}
