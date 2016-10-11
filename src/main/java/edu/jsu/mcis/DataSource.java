package edu.jsu.mcis;


import java.io.*;
import java.util.*;

public class DataSource{
	
	List<Student> sList;
	List<Course> cList;
	String line;
	Scanner scanner;
	int index;
	Student student;
	Course course;
	
	public DataSource(){
		sList = new ArrayList<>();
		cList = new ArrayList<>();
		line = null;
		scanner = null;
		index = 0;
		student = new Student();
		course = new Course();
	}
	
	public Student getStudent(String studentId){
		for(int i = 0; i < sList.size(); i++){
			if(studentId.equals(sList.get(i).getStudentId())){
				student =  sList.get(i);
			}
		}
		System.out.println(student);
		return student;
	}
	
	public Course getCourse(String courseId){
		for(int i = 0; i < cList.size(); i++){
			if(courseId.equals(cList.get(i).getCourseId())){
				course = cList.get(i);
			}
		}
		return course;
	}
	
	private void parseStudent() throws IOException{
		BufferedReader studentReader = new BufferedReader(new FileReader("src/test/resources/students.csv"));
		Student s = new Student();
		
		while ((line = studentReader.readLine()) != null) {
			scanner = new Scanner(line);
			scanner.useDelimiter(",");
			while (scanner.hasNext()) {
				String data2 = scanner.next();
				if (index == 0)
					s.setStudentId(data2);
				else if (index == 1)
					s.setFirstName(data2);
				else if (index == 2)
					s.setLastName(data2);
				else if (index == 3)
					s.setEmail(data2);
				else
					System.out.println("invalid data::" + data2);
				index++;
			}
			index = 0;
			sList.add(s);
		}
		studentReader.close();
	}
	
	private void parseCourse() throws IOException{
		BufferedReader courseReader = new BufferedReader(new FileReader("src/test/resources/courses.csv"));	
		Course c = new Course();
	
		while ((line = courseReader.readLine()) != null) {
			scanner = new Scanner(line);
			scanner.useDelimiter(",");
			while (scanner.hasNext()) {
				String data1 = scanner.next();
				if (index == 0)
					c.setCourseId(data1);
				else if (index == 1)
					c.setSemester(data1);
				else if (index == 2)
					c.setYear(data1);
				else if (index == 3)
					c.setNumStudents(data1);
				else
					System.out.println("invalid data::" + data1);
				index++;
			}
			index = 0;
			cList.add(c);
		}
		courseReader.close();
	}
}