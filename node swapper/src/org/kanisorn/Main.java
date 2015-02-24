/**
 * 
 */
package org.kanisorn;
import java.io.*;
import java.util.*;
import java.text.*;
import java.util.regex.*;


/**
 * @author kanisorn
 *
 */
public class Main {

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int level = in.nextInt();
        if (level < 1)
        	return;
        
        Node root = null;
        for (int i=0 i<level; i++) {
        	createTree(i, root, 0)
        }
        
	}
	
	
	
	static void createTree(int level, Node n, int count) {
		if 
	}

	private static class Node {
		Node left;
		Node right;
		int data;
	}
}
