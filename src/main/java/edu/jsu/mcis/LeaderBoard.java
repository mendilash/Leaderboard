package edu.jsu.mcis;

import org.junit.*;
import static org.junit.Assert.*;

import java.io.*;
import java.util.*;
import au.com.bytecode.opencsv.*;

public class LeaderBoard{
	
	DataSource ds = new DataSource();
	Student s;
	Course c;
	
	public LeaderBoard(){
		s = new Student();
		c = new Course();
	}
	
	public Object findByTypeAndId(String type, String id) throws IOException{
		
		if(type.equals("student")){
			s = ds.getStudent(id);
			return s;
		}
		else if(type.equals("course")){
			c = ds.getCourse(id);
			return c;
		}
		else {	return null;	}
	}	
}