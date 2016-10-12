package edu.jsu.mcis;

import java.io.*;
import java.util.*;

public class DataSource{
	
	ArrayList<Student> sList;
	ArrayList<Course> cList;
	String line;
	Scanner scanner;
	int index;
	Student student;
	Course course;
	
	public DataSource() throws IOException{
		sList = new ArrayList<>();
		cList = new ArrayList<>();
		line = null;
		scanner = null;
		index = 0;
		parseCourse();
		parseStudent();
	}
	
	public ArrayList getStudentList(){
		return sList;
	}
	
	public ArrayList getCourseList(){
		return cList;
	}
	
	public Student getStudent(String studentId){
		student = new Student(studentId);
		for(int i = 0; i < sList.size()-1; i++){
			if(studentId.equals(sList.get(i).getStudentId())){
				student = sList.get(i);
			}
		}
		return student;
	}
	
	public Course getCourse(String courseId){		
		course = new Course(courseId);
		for(int i = 0; i < cList.size()-1; i++){
			if(courseId.equals(cList.get(i).getCourseId())){
				course = cList.get(i);
			}
		}
		return course;
	}
	
	private void parseCourse() throws IOException{
		BufferedReader courseReader = new BufferedReader(new FileReader("src/test/resources/courses.csv"));	
		Course c = new Course();
		
		while ((line = courseReader.readLine()) != null) {
			scanner = new Scanner(line);
			scanner.useDelimiter(",");
			while (scanner.hasNext() && index < 4) {
				String data1 = scanner.next();
				data1 = data1.replaceAll("\"", "");
				if (index == 0){
					c.setCourseId(data1);
				}
				else if (index == 1){
					c.setSemester(data1);
				}
				else if (index == 2){
					c.setYear(data1);
				}
				else if (index == 3){
					c.setNumStudents(data1);
				}
				index++;
			}
			index = 0;
			cList.add(c);
		}
		courseReader.close();
	}
	
	private void parseStudent() throws IOException{
		BufferedReader studentReader = new BufferedReader(new FileReader("src/test/resources/students.csv"));
		Student s = new Student();
		
		while ((line = studentReader.readLine()) != null) {
			scanner = new Scanner(line);
			scanner.useDelimiter(",");
			while (scanner.hasNext() && index < 4) {
				String data2 = scanner.next();
				data2 = data2.replaceAll("\"", "");
				if (index == 0){
					s.setStudentId(data2);
				}
				else if (index == 1){
					s.setFirstName(data2);
				}
				else if (index == 2){
					s.setLastName(data2);
				}
				else if (index == 3){
					s.setEmail(data2);
				}
				index++;
			}
			index = 0;
			sList.add(s);
		}
		studentReader.close();
	}
}