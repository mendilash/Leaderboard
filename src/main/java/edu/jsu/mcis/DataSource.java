package edu.jsu.mcis;

import java.io.*;
import java.util.*;
import au.com.bytecode.opencsv.*;

public class DataSource{
	
	ArrayList<Student> studentList;
	ArrayList<Course> courseList;
	Student student;
	Course course;

	
	public DataSource() throws IOException{
		studentList = new ArrayList<>();
		courseList = new ArrayList<>();
		parseCourses();
		parseStudents();
	}
	
	public ArrayList getStudentList(){
		return studentList;
	}
	
	public ArrayList getCourseList(){
		return courseList;
	}
	
	public Student getStudent(String studentId){
		student = new Student(studentId);
		for(int i = 0; i < studentList.size()-1; i++){
			if(studentId.equals(studentList.get(i).getStudentId())){
				student = studentList.get(i);
			}
            else{
                student = null;
            }
		}
		return student;
	}
	
	public Course getCourse(String courseId){		
		course = new Course(courseId);
		for(int i = 0; i < courseList.size()-1; i++){
			if(courseId.equals(courseList.get(i).getCourseId())){
				course = courseList.get(i);
			}
            else{
                course = null;
            }
		}
		return course;
	}
	
    private void parseCourses() throws IOException{
        CSVReader reader = new CSVReader(new FileReader("src/test/resources/courses.csv"));
        String [] nextLine;
        while((nextLine = reader.readNext()) != null){
            if(nextLine[0].equals("ID")){
                
            }
            else if(!nextLine[0].equals("ID")){
                Course course = new Course();
                course.setCourseId(nextLine[0]);
                course.setSemester(nextLine[1]);
                course.setYear(nextLine[2]);
                course.setNumStudents(nextLine[3]);
                courseList.add(course);
            }
        }
        reader.close();
    }
    
    private void parseStudents() throws IOException{
        CSVReader reader = new CSVReader(new FileReader("src/test/resources/students.csv"));
        String [] nextLine;
        while((nextLine = reader.readNext()) != null){
            if(nextLine[0].equals("ID")){
                
            }
            else if(!nextLine[0].equals("ID")){
                Student student = new Student();
                student.setStudentId(nextLine[0]);
                student.setFirstName(nextLine[1]);
                student.setLastName(nextLine[2]);
                student.setEmail(nextLine[3]);
                studentList.add(student);
            }
        }
        reader.close();
    }
}