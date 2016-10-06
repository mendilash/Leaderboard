package edu.jsu.mcis;

import org.junit.*;
import static org.junit.Assert.*;

import java.io.*;
import java.util.*;

public class LeaderBoardTest {

	@Test
	public void testGetStudent() throws IOException{
		//LeaderBoard lb = new LeaderBoard("Student", 111111);
		Student s = new Student();
		assertEquals("[111111] Jerrod Shields jshields@jsu.edu", s.toString());
	}
}


