package edu.jsu.mcis;

import org.junit.*;
import static org.junit.Assert.*;

import java.io.*;
import java.util.*;
import au.com.bytecode.opencsv.*;

public class LeaderBoard{
	
	private String csvStringStudents;
	private String csvStringCourses;
	
	public LeaderBoard(String type,int id) throws IOException{
		
		//csvStringStudents = getFile("src/test/resources/students.csv");
		//csvStringCourses = getFile("src/test/resources/courses.csv");
		
		if(type.equals("Student")){
			CSVReader reader = new CSVReader(new FileReader("src/test/resources/students.csv"));
			String [] nextLine;
			while ((nextLine = reader.readNext()) != null) {
				int i = 0;
				System.out.println(nextLine[1]);
				i++;				
			}
		}
		else if(type.equals("Course")){
			
		}
	}
	
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
}