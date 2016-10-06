package edu.jsu.mcis;

import java.io.*;
import java.util.*;

public class Student{
	
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	
	public int getId(){
		return id;
	}
	
	public void setId(int id){
		this.id = id;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName){
		this.firstName = firstName;
	}
	
	public String getLastName(){
		return lastName;
	}
	
	public void setLastName(String lastName){
		this.lastName = lastName;
	}
	
	public String getEmail(){
		return email;
	}
	
	public void setEmail(String email){
		this.email = email;
	}
	
	@Override
	public String toString(){
		return "["+ getId() +"]" + getFirstName() + getLastName() + getEmail() + "@jsu.edu";
	}
}



