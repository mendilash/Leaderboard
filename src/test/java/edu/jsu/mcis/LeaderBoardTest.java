package edu.jsu.mcis;

import org.junit.*;
import static org.junit.Assert.*;

import java.io.*;
import java.util.*;

public class LeaderBoardTest {


	@Test
	public void testGetStudent() throws IOException{
		//DataSource ds = new DataSource();
		LeaderBoard lb = new LeaderBoard();
		Object obj = lb.findByTypeAndId("student", "111111");
		
		assertEquals("[111111] Jerrod Shields jshields@jsu.edu", lb.toString());
	}
	
	/*@Test
	public void studentListHasItems(){
		List<Student> student = new ArrayList<>();
	}*/
}


