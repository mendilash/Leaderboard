package edu.jsu.mcis;

import java.io.*;
import java.util.*;

public class LeaderBoard{
	
	DataSource dataSource;
	Student student;
	Course course;
	public String output;
	public static String[] studentIdOutput;
	public static String[] courseIdOutput;
	
	public LeaderBoard()throws IOException{}
	
	
	public LeaderBoard(String idType)throws IOException{
		dataSource = new DataSource();

		if(idType.equals("studentids")){			
			studentIdOutput = new String[300];
			setStudentIdOutput();
			studentIdOutput = getStudentIdOutput();			
		}
		if(idType.equals("courseids")){
			courseIdOutput = new String[25];
			setCourseIdOutput();
			courseIdOutput = getCourseIdOutput();	
		}
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
	
	@SuppressWarnings("unchecked")
	public void setStudentIdOutput(){
		ArrayList<Student> studentList = dataSource.getStudentList();
		for(int i = 0; i < studentList.size(); i++){
			studentIdOutput[i] = studentList.get(i).getStudentId();
		}		
	}
	
	public String[] getStudentIdOutput(){
		return studentIdOutput;
	}
	
	@SuppressWarnings("unchecked")
	public void setCourseIdOutput(){
		ArrayList<Course> courseList = dataSource.getCourseList();
		for(int i = 0; i < courseList.size(); i++){
			courseIdOutput[i] = courseList.get(i).getCourseId();
		}
	}
	
	public String[] getCourseIdOutput(){
		return courseIdOutput;
	}
	
	public String findStudentById(String id){
		student = new Student(id);		
		student = dataSource.getStudent(id);
		
		return student.toString();
	}
	
	public String findCourseById(String id){
		course = new Course(id);
		course = dataSource.getCourse(id);
		
		return course.toString();
	}
	
	public static void main(String[] args)throws IOException{
		String string = "";
		if(args.length >1){
			LeaderBoard leaderBoard = new LeaderBoard(args[0], args[1]);
			System.out.println(leaderBoard.getOutput());
		}
		else{
			LeaderBoard leaderBoard = new LeaderBoard(args[0]);
			if(args[0].equals("studentids")){
				leaderBoard.getStudentIdOutput();
				for(int i = 0; i < studentIdOutput.length; i++){
					string = studentIdOutput[i];
					System.out.println(string);
				}
			}
			if(args[0].equals("courseids")){
				leaderBoard.getCourseIdOutput();
				for(int i = 0; i < courseIdOutput.length; i++){
					string = courseIdOutput[i];
					System.out.println(string);
				}
			}
		}
	}
}