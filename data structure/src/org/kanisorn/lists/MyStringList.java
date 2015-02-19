/**
 * 
 */
package org.kanisorn.lists;

import java.util.NoSuchElementException;

import org.omg.CORBA.portable.ApplicationException;

/**
 * @author kanisorn
 *
 */
public class MyStringList {
	private String [] strArray;
	private int currentSize;
	private int currentIndex;
	private int defaultSize = 10;
	
	public MyStringList() {
		strArray = new String[defaultSize];
		this.currentSize = 0;
		this.currentIndex = -1;
	}
	
	public int length() {
		return this.currentSize;
	}
	
	private void resize() {
		String [] tmpArray = new String[this.currentSize * 2];
		
		System.arraycopy(this.strArray, 0, tmpArray, 0, this.strArray.length);
		this.strArray = tmpArray;
	}
	
	public void add(String s) {
		if (this.currentSize == this.strArray.length)
			this.resize();
		
		this.currentIndex++;
		this.currentSize++;
		
		this.strArray[this.currentIndex] = s;
	}
	
	public String get(int i) {
		if (i > this.currentIndex) {
			throw new NoSuchElementException("No Such Element in " + i);
		}
		
		return this.strArray[i];
	}
	
	public boolean find(String s) {
		boolean found = false;
		
		for (int i=0; i<=this.currentIndex; i++) {
			if (this.strArray[i].equals(s)){
				found = true;
				break;
			}
		}
		
		return found;
	}
	
}
