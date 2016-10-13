package edu.jsu.mcis;

import java.io.*;
import java.util.*;

public class LeaderBoard{
	
	DataSource dataSource;
	Student student;
	Course course;
	String output;
	
	public LeaderBoard()throws IOException{
		
	}
	
	public LeaderBoard(String type, String id)throws IOException{
		dataSource = new DataSource();
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
		//student = new Student(id);		
		student = dataSource.getStudent(id);
		if(student != null){
            return student.toString();
        }
        else
		    return student.badStudent();
	}
	
	public String findCourseById(String id){
		//course = new Course(id);
		course = dataSource.getCourse(id);
		if(course != null){
            return course.toString();
        }
        else
            return course.badCourse();
	}
	
	public static void main(String[] args)throws IOException{
		LeaderBoard leaderBoard = new LeaderBoard(args[0], args[1]);
		System.out.println(leaderBoard.getOutput());
	}
}