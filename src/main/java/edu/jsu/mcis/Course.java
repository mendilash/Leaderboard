import java.io.*;
import java.util.*;


public class Course{
	
	private int id;
	private String semester;
	private String year;
	private String numstudents;
	
	public int getId(){
		return id;
	}
	
	public void setId(int id){
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
		return "["+ getId() +"]" + getSemester() + getYear() +"(" +getNumStudents()+" students)";
	}
}