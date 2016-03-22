package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;

public class Staff_Test {

	@BeforeClass
	public static void setup() {
	}

	@Test
	public void test() {
		assertEquals(1, 1);
	}

	@Test
	public void test_staff() throws PersonException {
		Calendar today = Calendar.getInstance();
		Staff stafftest1 = new Staff("a", "a", "a", null, "a", "393-393-0000", null, null, 0, 20000, null, null);
		Staff stafftest2 = new Staff("a", "a", "a", null, "a", "444-444-4444", null, null, 0, 50000, null, null);
		Staff stafftest3 = new Staff("a", "a", "a", null, "a", "302-949-0494", null, null, 0, 60000, null, null);
		Staff stafftest4 = new Staff("a", "a", "a", null, "a", "304-444-3432", null, null, 0, 30000, null, null);
		Staff stafftest5 = new Staff("a", "a", "a", null, "a", "333-444-5555", null, null, 0, 70000, null, null);
		ArrayList<Staff> StaffRecords = new ArrayList<Staff>();
		StaffRecords.add(stafftest1);
		StaffRecords.add(stafftest2);
		StaffRecords.add(stafftest3);
		StaffRecords.add(stafftest4);
		StaffRecords.add(stafftest5);
		double salary1 = stafftest1.getSalary();
		double salary2 = stafftest2.getSalary();
		double salary3 = stafftest3.getSalary();
		double salary4 = stafftest4.getSalary();
		double salary5 = stafftest5.getSalary();
		double averageSalary = (salary1 + salary2 + salary3 + salary4 + salary5) / 5;
		double expectedAverage = 46000;
		assertEquals(expectedAverage, averageSalary, .001);
	}

	@Test
	public void test_PersonException() throws PersonException{
		Staff exceptiontest = new Staff(null, null, null, null, null, null, null, null, 0, 0, null, null);
		PersonException thrown;
		
	}
}