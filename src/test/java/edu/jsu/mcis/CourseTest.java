package edu.jsu.mcis;

import org.junit.*;
import static org.junit.Assert.*;
import java.io.*;
import java.util.*;

public class CourseTest{
	
	@Test
	public void testGetCourseID(){
		Course course = new Course("99000");		
		assertEquals("99000", course.getCourseId());
	}
	
	@Test
	public void testGetSemester(){
		Course course = new Course();
		course.setSemester("Spring");
		assertEquals("Spring", course.getSemester());
	}
	
	@Test
	public void testGetYear(){
		Course course = new Course();
		course.setYear("2013");
		assertEquals("2013", course.getYear());
	}
	
	@Test
	public void testGetNumStudents(){
		Course course = new Course();
		course.setNumStudents("11");
		assertEquals("11", course.getNumStudents());
	}
	
	@Test
	public void testToString(){
		Course course = new Course();
		course.setCourseId("99000");
		course.setSemester("Spring");
		course.setYear("2013");
		course.setNumStudents("11");
		assertEquals("[99000] Spring 2013 (11 students)", course.toString());
	}
}