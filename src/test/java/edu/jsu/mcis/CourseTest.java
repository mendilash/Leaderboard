package edu.jsu.mcis;

import org.junit.*;
import static org.junit.Assert.*;

import java.io.*;
import java.util.*;

public class CourseTest{
	
	@Test
	public void testGetCourseID(){
		Course c = new Course("99000");		
		assertEquals("99000", c.getCourseId());
	}
	
	@Test
	public void testGetSemester(){
		Course c = new Course();
		c.setSemester("Spring");
		assertEquals("Spring", c.getSemester());
	}
	
	@Test
	public void testGetYear(){
		Course c = new Course();
		c.setYear("2013");
		assertEquals("2013", c.getYear());
	}
	
	@Test
	public void testGetNumStudents(){
		Course c = new Course();
		c.setNumStudents("11");
		assertEquals("11", c.getNumStudents());
	}
	
	@Test
	public void testToString(){
		Course c = new Course();
		c.setCourseId("99000");
		c.setSemester("Spring");
		c.setYear("2013");
		c.setNumStudents("11");
		assertEquals("[99000] Spring 2013 (11 students)", c.toString());
	}
}