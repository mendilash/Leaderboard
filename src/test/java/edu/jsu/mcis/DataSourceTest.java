package edu.jsu.mcis;

import org.junit.*;
import static org.junit.Assert.*;

import java.io.*;
import java.util.*;

public class DataSourceTest{
	
	private DataSource ds;


	@Before
	public void setUp(){
		ds = new DataSource();
	}
	
	@Test
	public void testGetStudentIsFillingList()throws IOException{
		Student student = ds.getStudent();
		//assertEquals(NUMBER, student.size());
		if(student.size() > 0){
			assertTrue(true);
		}
		else{	assertTrue(false);	}
	}
	
	@Test
	public void testGetCourseIsFillingList()throws IOException{
		Course course = ds.getCourse();
		if(course.size() > 0){
			assertTrue(true);
		}
		else{
			assertTrue(false);
		}
	}	
}