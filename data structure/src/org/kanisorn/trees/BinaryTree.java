/**
 * 
 */
package org.kanisorn.trees;

/**
 * @author kanisorn
 *
 */
public class BinaryTree<E extends Comparable<E>> {

	private Node<E> root = new Node<E>(null, null, null);
	
	public BinaryTree(E initialData) {
		add(root, root.left, initialData);
	}
	
	public void add(E newData) {
		add(root, root.left, newData);
	}
	
	private void add(Node<E> parent, Node<E> self, E newData) {
		if (self == null) {
			if (parent==root || parent.data.compareTo(newData) > 0) {
				// settle
				parent.left = new Node<E>(null, newData, null);
				
			} else if (parent.data.compareTo(newData) < 0) {
				// settle
				parent.right = new Node<E>(null, newData, null);
			} else {
				// duplicate -->  ignore
			}
		} else {
			if (self.data.compareTo(newData) > 0) {
				add(self, self.left, newData);
			} else if (self.data.compareTo(newData) < 0) {
				add(self, self.right, newData);
			} else {
				// duplicate --> ignore
			}
		}
		
	}
	public void traverseInorder() {
		if (root.left != null)
			traverseInorder(root.left);
	}
	private void traverseInorder(Node<E> node) {
		if (node.left != null)
			traverseInorder(node.left);
		
		System.out.println(node.data.toString());
		
		if (node.right != null) 
			traverseInorder(node.right);
	}
//	private Node<E> add(Node<E> node, E newData){
//		if (node == null) {
//			return new Node<E>(null, newData, null);
//		} else if (node.data.compareTo(newData) < 0) {
//			node.right = add(node.right, newData);
//		} else if (node.data.compareTo(newData) > 0) {
//			node.right = add(node.left, newData);
//		} else {
//			return;
//		}
//	}
	

	private static class Node<E extends Comparable<E>> {
		Node left;
		Node right;
		E data;
		
		Node(Node left, E data, Node right) {
			this.left = left;
			this.data = data;
			this.right = right;
		}
	}
}
