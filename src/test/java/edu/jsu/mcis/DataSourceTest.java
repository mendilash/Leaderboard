package edu.jsu.mcis;

import org.junit.*;
import static org.junit.Assert.*;

import java.io.*;
import java.util.*;

public class DataSourceTest{
	
	private DataSource ds;


	@Before
	public void setUp()throws IOException{
		ds = new DataSource();
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
		Student student = ds.getStudent("111111");
		assertEquals("111111", student.getStudentId());
	}
	
	@Test
	public void testGetStudentFirstName()throws IOException{
		Student student = ds.getStudent("111111");
		assertEquals("Jerrod", student.getFirstName());
	}

	@Test
	public void testGetStudentLastName()throws IOException{
		Student student = ds.getStudent("111111");
		assertEquals("Shields", student.getLastName());
	}
	
	@Test
	public void testGetStudentEmail()throws IOException{
		Student student = ds.getStudent("111111");
		assertEquals("jshields", student.getEmail());
	}
	
	@Test
	public void testGetCourseId()throws IOException{
		Course course = ds.getCourse("99000");
		assertEquals("99000", course.getCourseId());
	}
	
	@Test
	public void testGetCourseSemester()throws IOException{
		Course course = ds.getCourse("99000");
		assertEquals("Spring", course.getSemester());
	}
	
	@Test
	public void testGetCourseYear()throws IOException{
		Course course = ds.getCourse("99000");
		assertEquals("2013", course.getSemester());
	}
	
	@Test
	public void testGetCourseNumStudents()throws IOException{
		Course course = ds.getCourse("99000");
		assertEquals("11", course.getSemester());
	}
}