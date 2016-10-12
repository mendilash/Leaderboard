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
	String output;
	
	public LeaderBoard()throws IOException{
		ds = new DataSource();
	}
	
	public LeaderBoard(String type, String id)throws IOException{
		ds = new DataSource();
		output = "";
		if(type.equals("student")){
			output = findStudentById(id);
		}
		if(type.equals("course")){
			output = findCourseById(id);
		}
	}
	
	public String getOutput(){
		return output;
	}
	
	public String findStudentById(String id){
		student = new Student(id);		
		student = ds.getStudent(id);
		
		return student.toString();
	}
	
	public String findCourseById(String id){
		course = new Course(id);
		course = ds.getCourse(id);
		
		return course.toString();
	}
	
	public static void main(String[] args)throws IOException{
		LeaderBoard lb = new LeaderBoard(args[0], args[1]);
		lb.getOutput();
	}
}