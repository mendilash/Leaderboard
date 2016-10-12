package edu.jsu.mcis;

import org.junit.*;
import static org.junit.Assert.*;

import java.io.*;
import java.util.*;

public class LeaderBoardTest {

	@Test
	public void testFindStudentById()throws IOException{
		LeaderBoard lb = new LeaderBoard("Student", "111111");
		assertEquals("[111111] Jerrod Shields jshields@jsu.edu", lb.findStudentById("111111"));
	}
	
	@Test
	public void testFindByTypeAsCourse()throws IOException{
		LeaderBoard lb = new LeaderBoard("Course", "99000");
		assertEquals("[99000] Spring 2013 (11 students)", lb.findCourseById("99000"));
	}
}


