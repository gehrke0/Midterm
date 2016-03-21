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
ArrayList<Staff> obj = new ArrayList<Staff>();
obj.add(stafftest1);
obj.add(stafftest2);
obj.add(stafftest3);
obj.add(stafftest4);
obj.add(stafftest5);
}
}