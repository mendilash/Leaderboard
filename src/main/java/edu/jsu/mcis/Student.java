package edu.jsu.mcis;

import java.io.*;
import java.util.*;

public class Student{
	
	private String id;
	private String firstName;
	private String lastName;
	private String email;
	
	public Student(){
		id = "";
		firstName = "";
		lastName= "";
		email = "";
	}
	
	public Student(String studentId){
		this.id = studentId;
		firstName = "";
		lastName= "";
		email = "";
	}
	
	public String getStudentId(){
		return id;
	}
	
	public void setStudentId(String studentId){
		this.id = studentId;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String fName){
		this.firstName = fName;
	}
	
	public String getLastName(){
		return lastName;
	}
	
	public void setLastName(String lName){
		this.lastName = lName;
	}
	
	public String getEmail(){
		return email;
	}
	
	public void setEmail(String mail){
		this.email = mail;
	}
	
	@Override
	public String toString(){
		return "["+ getStudentId() +"] " + getFirstName() + " " + getLastName() + " " + getEmail() + "@jsu.edu";
	}
}



