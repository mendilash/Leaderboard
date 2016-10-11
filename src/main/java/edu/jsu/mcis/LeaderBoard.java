package edu.jsu.mcis;

import org.junit.*;
import static org.junit.Assert.*;

import java.io.*;
import java.util.*;
import au.com.bytecode.opencsv.*;

public class LeaderBoard{
	
	DataSource ds;
	Student student;
	Course course;
	
	public LeaderBoard()throws IOException{
		ds = new DataSource();
	}
	
	public LeaderBoard(String type, String id)throws IOException{
		ds = new DataSource();
	}
	
	/*public Object findByTypeAndId(String type, String id) throws IOException{
		
		student = new Student(id);
		course = new Course(id);
		
		if(type.equals("student")){
			student = ds.getStudent(id);
			return student;
		}
		else if(type.equals("course")){
			course = ds.getCourse(id);
			return course;
		}
		else {	return null;	}
	}*/
	
	public String findStudentById(String id){
		student = new Student(id);		
		student = ds.getStudent(id);
		
		return student.toString();
	}
	
	public Course findCourseById(String id){
		course = new Course(id);
		course = ds.getCourse(id);
		
		return course;
	}
}