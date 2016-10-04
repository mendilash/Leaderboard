package edu.jsu.mcis;

import org.junit.*;
import static org.junit.Assert.*;

import java.io.*;
import java.util.*;


public class LeaderBoardTest {
	private String csvStringStudents;
	private String csvStringCourses;
	
	
	private static String getFile(String dir) throws IOException{
        File inFile = new File(dir);
        Scanner scanner = new Scanner(inFile);
        String newLine = System.getProperty("line.separator");
        String out = "";
        
        try{
            while(scanner.hasNextLine()){
                out += scanner.nextLine() + newLine;
            }
            return out;
        }
        finally{
            scanner.close();
        }
    }
	

	@Before
	public void setUp() throws IOException {
		csvStringStudents = getFile("src/test/resources/students.csv");
		csvStringCourses = getFile("src/test/resources/courses.csv");
		LeaderBoard lb = new LeaderBoard();
		
	}
	

	@Test
	public void testGetStudent(){
		
		assertEquals("", lb.getStudent());
		
	}
		




}