package edu.jsu.mcis;

import org.junit.*;
import static org.junit.Assert.*;
import java.io.*;
import java.util.*;

public class StudentTest{
	
	@Test
	public void testGetStudentID(){
		Student student = new Student("111111");
		
		assertEquals("111111", student.getStudentId());
	}
	
	@Test
	public void testGetFirstName(){
		Student student = new Student();
		student.setFirstName("Jerrod");
		assertEquals("Jerrod", student.getFirstName());
	}
	
	@Test
	public void testGetLastName(){
		Student student = new Student();
		student.setLastName("Shields");
		assertEquals("Shields", student.getLastName());
	}
	
	@Test
	public void testGetEmail(){
		Student student = new Student();
		student.setEmail("jshields");
		assertEquals("jshields", student.getEmail());
	}
	
	@Test
	public void testToString(){
		Student student = new Student();
		student.setStudentId("111111");
		student.setFirstName("Jerrod");
		student.setLastName("Shields");
		student.setEmail("jshields");
		assertEquals("[111111] Jerrod Shields jshields@jsu.edu", student.toString());
	}
}