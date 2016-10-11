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
	public void testGetStudent()throws IOException{
		Student student = ds.getStudent("111111");
		assertEquals("111111", student);
		/*if(student == ){
			assertTrue(true);
		}
		else{		assertTrue(false);	}*/
	}
	
	@Test
	public void testGetCourse()throws IOException{
		Course course = ds.getCourse("99000");
		assertEquals("99000", course);
		/*if(course.size() > 0){
			assertTrue(true);
		}
		else{		assertTrue(false);	}*/
	}
}