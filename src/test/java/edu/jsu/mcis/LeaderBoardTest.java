package edu.jsu.mcis;

import org.junit.*;
import static org.junit.Assert.*;
import java.io.*;
import java.util.*;

public class LeaderBoardTest {

	@Test
	public void testFindStudentById()throws IOException{
		LeaderBoard leaderBoard = new LeaderBoard("Student", "111111");
		assertEquals("[111111] Jerrod Shields jshields@jsu.edu", leaderBoard.findStudentById("111111"));
	}
	
	@Test
	public void testFindByTypeAsCourse()throws IOException{
		LeaderBoard leaderBoard = new LeaderBoard("Course", "99000");
		assertEquals("[99000] Spring 2013 (11 students)", leaderBoard.findCourseById("99000"));
	}
	
	@Test
	public void testListAllStudentIds()throws IOException{
		LeaderBoard leaderBoard = new LeaderBoard("studentids");
		String[] studentIdOutput = new String[300];
		studentIdOutput = leaderBoard.getStudentIdOutput();
		assertEquals("111111", studentIdOutput[0]);
		assertEquals("111410", studentIdOutput[299]);
	}
	
	@Test
	public void testListAllCourseIds()throws IOException{
		LeaderBoard leaderBoard = new LeaderBoard("courseids");
		String[] courseIdOutput = new String[25];
		courseIdOutput = leaderBoard.getCourseIdOutput();
		assertEquals("99000", courseIdOutput[0]);
		assertEquals("99024", courseIdOutput[24]);
	}
}


