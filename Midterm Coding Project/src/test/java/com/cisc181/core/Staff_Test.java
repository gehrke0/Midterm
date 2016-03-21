package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;

import org.junit.BeforeClass;
import org.junit.Test;

public class Staff_Test {

	@BeforeClass
	public static void setup() {
	}
	
	@Test
	public void test() {
		assertEquals(1,1);
	}	
	@Test
	public void test_staff() throws PersonException{
		Staff stafftest1 = new Staff(null, null, null, null, null, null, null, null, 0, 20000, null, null);
		Staff stafftest2 = new Staff(null, null, null, null, null, null, null, null, 0, 50000, null, null);
		Staff stafftest3 = new Staff(null, null, null, null, null, null, null, null, 0, 60000, null, null);
		Staff stafftest4 = new Staff(null, null, null, null, null, "304-44-3432", null, null, 0, 30000, null, null);
		Staff stafftest5 = new Staff(null, null, null, null, null, null, null, null, 0, 70000, null, null);
ArrayList<Staff> StaffRecords = new ArrayList<Staff>();
StaffRecords.add(stafftest1);
StaffRecords.add(stafftest2);
StaffRecords.add(stafftest3);
StaffRecords.add(stafftest4);
StaffRecords.add(stafftest5);
private double calculateAverage(List <Staff> marks) {
	  Integer sum = 0;
	  if(!marks.isEmpty()) {
	    for (Integer mark : marks) {
	        sum += mark;
	    }
	    return sum.doubleValue() / marks.size();
	  }
	  return sum;
	}

}
	
}