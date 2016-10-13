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
    public void testBadStudent()throws IOException{
        LeaderBoard leaderBoard = new LeaderBoard("Student", "999999");
        assertEquals("Invalid student data!", leaderBoard.findStudentById("999999"));
    }
}




