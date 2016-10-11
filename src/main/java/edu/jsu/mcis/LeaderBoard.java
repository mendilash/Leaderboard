package edu.jsu.mcis;

import org.junit.*;
import static org.junit.Assert.*;

import java.io.*;
import java.util.*;
import au.com.bytecode.opencsv.*;

public class LeaderBoard{
	
	DataSource ds = new DataSource();
	Student student;
	Course course;
	
	public LeaderBoard(){
		student = new Student();
		course = new Course();
	}
	
	public Object findByTypeAndId(String type, String id) throws IOException{
		
		if(type.equals("student")){
			student = ds.getStudent(id);
			return student;
		}
		else if(type.equals("course")){
			course = ds.getCourse(id);
			return course;
		}
		else {	return null;	}
	}	
}