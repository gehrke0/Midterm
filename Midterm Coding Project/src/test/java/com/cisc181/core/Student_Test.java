package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;

import org.junit.BeforeClass;
import org.junit.Test;

public class Student_Test {

	@BeforeClass
	public static void setup() throws PersonException {
		ArrayList<Course> CourseRecords = new ArrayList<Course>();
		Course CourseTest1 = new Course();
		Course CourseTest2 = new Course();
		Course CourseTest3 = new Course();
		CourseRecords.add(CourseTest1);
		CourseRecords.add(CourseTest2);
		CourseRecords.add(CourseTest3);
		ArrayList<Semester> SemesterRecords = new ArrayList<Semester>();
		Semester SemesterTest1 = new Semester();
		Semester SemesterTest2 = new Semester();
		Semester SemesterTest3 = new Semester();
		SemesterRecords.add(SemesterTest1);
		SemesterRecords.add(SemesterTest2);
		SemesterRecords.add(SemesterTest3);
		ArrayList<Section> SectionRecords = new ArrayList<Section>();
		Section SectionTest1 = new Section();
		Section SectionTest2 = new Section();
		Section SectionTest3 = new Section();
		Section SectionTest4 = new Section();
		Section SectionTest5 = new Section();
		Section SectionTest6 = new Section();
		SectionRecords.add(SectionTest1);
		SectionRecords.add(SectionTest2);
		SectionRecords.add(SectionTest3);
		SectionRecords.add(SectionTest4);
		SectionRecords.add(SectionTest5);
		SectionRecords.add(SectionTest6);
		ArrayList<Student> StudentRecords = new ArrayList<Student>();
		Student StudentTest1 = new Student(null, null, null, null, null, null, null, null);
		Student StudentTest2 = new Student(null, null, null, null, null, null, null, null);
		Student StudentTest3 = new Student(null, null, null, null, null, null, null, null);
		Student StudentTest4 = new Student(null, null, null, null, null, null, null, null);
		Student StudentTest5 = new Student(null, null, null, null, null, null, null, null);
		Student StudentTest6 = new Student(null, null, null, null, null, null, null, null);
		Student StudentTest7 = new Student(null, null, null, null, null, null, null, null);
		Student StudentTest8 = new Student(null, null, null, null, null, null, null, null);
		Student StudentTest9 = new Student(null, null, null, null, null, null, null, null);
		Student StudentTest10 = new Student(null, null, null, null, null, null, null, null);
	}

	@Test
	public void test() {
		assertEquals(1, 1);
	}
	@Test
	public void test_student(){}
}