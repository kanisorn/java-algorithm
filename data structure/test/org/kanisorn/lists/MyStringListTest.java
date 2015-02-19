/**
 * 
 */
package org.kanisorn.lists;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author kanisorn
 *
 */
public class MyStringListTest {

	private MyStringList li;
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		li = new MyStringList();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		li = null;
	}

	/**
	 * Test method for {@link org.kanisorn.lists.MyStringList#add(java.lang.String)}.
	 */
	@Test
	public void testAdd() {
		assertEquals("length of blank list should be 0", 0, li.length());
		
		for (int i=1; i<15; i++) {
			li.add("test string " + i);
			assertEquals("length of list should be " + i , i, li.length());
		}
		
		for (int i=0; i<li.length(); i++) {
			assertEquals("compare value in lists", "test string " + (i+1) , li.get(i));
		}
		
	}


	/**
	 * Test method for {@link org.kanisorn.lists.MyStringList#find(STring)}.
	 */
	@Test
	public void testFind() {
		assertEquals("should return false for nonexist string", false, li.find("non-exist string"));
		
		li.add("sample string 1");
		
		assertEquals("should return true for exist string", true, li.find("sample string 1"));
	}

}
