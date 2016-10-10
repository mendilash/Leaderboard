package edu.jsu.mcis;

import org.junit.*;
import static org.junit.Assert.*;

import java.io.*;
import java.util.*;

public class StudentTest{
	
	@Test
	public void testGetStudentID(){
		Student s = new Student("111111");
		
		assertEquals("111111", s.getStudentId());
	}
	
	@Test
	public void testGetFirstName(){
		Student s = new Student();
		s.setFirstName("Jerrod");
		assertEquals("Jerrod", s.getFirstName());
	}
	
	@Test
	public void testGetLastName(){
		Student s = new Student();
		s.setLastName("Shields");
		assertEquals("Shields", s.getLastName());
	}
	
	@Test
	public void testGetEmail(){
		Student s = new Student();
		s.setEmail("jshields");
		assertEquals("jshields", s.getEmail());
	}
	
	@Test
	public void testToString(){
		Student s = new Student();
		s.setStudentId("111111");
		s.setFirstName("Jerrod");
		s.setLastName("Shields");
		s.setEmail("jshields");
		assertEquals("[111111] Jerrod Shields jshields@jsu.edu", s.toString());
	}
}