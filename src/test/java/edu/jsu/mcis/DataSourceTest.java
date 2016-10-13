package edu.jsu.mcis;

import org.junit.*;
import static org.junit.Assert.*;
import java.io.*;
import java.util.*;

public class DataSourceTest{
	
	private DataSource dataSource;
	private Student student;
	private Course course;

	@Before
	public void setUp()throws IOException{
		dataSource = new DataSource();
		student = dataSource.getStudent("111111");
		course = dataSource.getCourse("99000");
	}
	
	@Test
	public void testParseStudent(){
		ArrayList studentList = dataSource.getStudentList();
		assertEquals(300, studentList.size());
	}
	
	@Test
	public void testParseCourse(){
		ArrayList courseList = dataSource.getCourseList();
		assertEquals(25, courseList.size());
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