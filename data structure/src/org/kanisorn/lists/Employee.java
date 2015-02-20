package org.kanisorn.lists;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Employee {
	private String firstName;
	private String lastName;
	private HashMap salaryRecord = new HashMap();
	
	
	public String getFirstName() {
		return this.firstName;
	}
	public String getLastName() {
		return this.lastName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void addEntry(String date, double paycheckAmount) {
		salaryRecord.put(date, paycheckAmount);
	}
	public void printPaymentAmount(String date) {
		Object record = salaryRecord.get(date);
		
		if (record == null)
			System.out.println(this.firstName + " " + this.lastName + " did not receive a paycheck on " + date);
		else
			//Jim Jones was paid 3085.0 on 3/15/2006
			System.out.println(this.firstName + " " + this.lastName + " was paid " + (Double)record + " on " + date);
	}
	
	public void printAveragePaycheck() {
		Iterator it = this.salaryRecord.keySet().iterator();
		double sum = 0;
		int count = 0;
		
		while(it.hasNext()) {
			String date = it.next().toString();
			
			double amount = (double)this.salaryRecord.get(date);
			sum += amount;
			count++;
			
		}
		
		System.out.println("average=" + sum / count);
		System.out.println("sum=" + sum );
		System.out.println("count=" + count);
	}
}
