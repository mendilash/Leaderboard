package edu.jsu.mcis;

import org.junit.*;
import static org.junit.Assert.*;

import java.io.*;
import java.util.*;

public class LeaderBoardTest {


	@Test
	public void testGetStudent() throws IOException{
		LeaderBoard lb = new LeaderBoard();
		List studentList = new ArrayList<>();
		studentList = lb.findByTypeAndId("student", "111111");
		
		assertEquals("111111] Jerrod Shields jshields@jsu.edu", studentList.toString());
	}
	
	@Test
	public void testGetCourse() throws IOException{
		LeaderBoard lb = new LeaderBoard();
		List courseList = new ArrayList<>();
		courseList = lb.findByTypeAndId("course", "99000");
		
		assertEquals("[99000] Spring	2013	(11 students)", courseList.toString());
	}
}


