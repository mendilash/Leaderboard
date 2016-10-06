package edu.jsu.mcis;

import org.junit.*;
import static org.junit.Assert.*;

import java.io.*;
import java.util.*;
import au.com.bytecode.opencsv.*;

public class LeaderBoard{
	
	DataSource ds = new DataSource();
	
	public List findByTypeAndId(String type, String id) throws IOException{
		List<Student> s = new ArrayList<Student>();
		List<Course> c = new ArrayList<Course>();
		
		if(type.equals("student")){
			s = ds.getStudent();
			return s;
		}
		else if(type.equals("course")){
			c = ds.getCourse();
			return c;
		}
		return null;
	}	
	
}