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
	
	public Course(String id){
		this.id = id;
		semester = "";
		year = "";
		numstudents = "";
	}
	
	public String getCourseId(){
		return id;
	}
	
	public void setCourseId(String id){
		this.id = id;
	}
	
	public String getSemester() {
		return semester;
	}
	
	public void setSemester(String semester){
		this.semester = semester;
	}
	
	public String getYear(){
		return year;
	}
	
	public void setYear(String year){
		this.year = year;
	}
	
	public String getNumStudents(){
		return numstudents;
	}
	
	public void setNumStudents(String numstudents){
		this.numstudents = numstudents;
	}
	
	@Override
	public String toString(){
		return "["+ getCourseId() +"]" + getSemester() + getYear() +"(" +getNumStudents()+" students)";
	}
}