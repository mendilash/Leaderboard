package edu.jsu.mcis;

import java.io.*;
import java.util.*;

public class Course{
	
	private String id;
	private String semester;
	private String year;
	private String numstudents;
	
	public Course(){
		id = "";
		semester = "";
		year = "";
		numstudents = "";
	}
	
	public Course(String courseId){
		this.id = courseId;
		semester = "";
		year = "";
		numstudents = "";
	}
	
	public String getCourseId(){
		return id;
	}
	
	public void setCourseId(String courseId){
		this.id = courseId;
	}
	
	public String getSemester() {
		return semester;
	}
	
	public void setSemester(String incomingSemester){
		this.semester = incomingSemester;
	}
	
	public String getYear(){
		return year;
	}
	
	public void setYear(String incomingYear){
		this.year = incomingYear;
	}
	
	public String getNumStudents(){
		return numstudents;
	}
	
	public void setNumStudents(String incomingNumStudents){
		this.numstudents = incomingNumStudents;
	}
	
    public String badCourse(){
        return "Invalid course data!";
    }
    
	@Override
	public String toString(){
		return "["+ getCourseId() +"] "  + getSemester() + " " + getYear() +" (" +getNumStudents()+" students)";
	}
}