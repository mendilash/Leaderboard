package edu.jsu.mcis;

import org.junit.*;
import static org.junit.Assert.*;

import java.io.*;
import java.util.*;

public class DataSourceTest{
	
	private DataSource ds;
	private Student student;
	private Course course;


	@Before
	public void setUp()throws IOException{
		ds = new DataSource();
		student = ds.getStudent("111111");
		course = ds.getCourse("99000");
	}
	
	@Test
	public void testParseStudent(){
		ArrayList sList = ds.getStudentList();
		assertEquals(301, sList.size());
	}
	
	@Test
	public void testParseCourse(){
		ArrayList cList = ds.getCourseList();
		assertEquals(26, cList.size());
	}
	
	@Test
	public void testGetStudentId()throws IOException{
		assertEquals("111111", student.getStudentId());
	}
	
	@Test
	public void testGetStudentFirstName()throws IOException{
		assertEquals("Jerrod", student.getFirstName());
	}

	@Test
	public void testGetStudentLastName()throws IOException{
		assertEquals("Shields", student.getLastName());
	}
	
	@Test
	public void testGetStudentEmail()throws IOException{
		assertEquals("jshields", student.getEmail());
	}
	
	@Test
	public void testGetCourseId()throws IOException{
		assertEquals("99000", course.getCourseId());
	}
	
	@Test
	public void testGetCourseSemester()throws IOException{
		assertEquals("Spring", course.getSemester());
	}
	
	@Test
	public void testGetCourseYear()throws IOException{
		assertEquals("2013", course.getYear());
	}
	
	@Test
	public void testGetCourseNumberOfStudents()throws IOException{
		assertEquals("11", course.getNumStudents());
	}
}