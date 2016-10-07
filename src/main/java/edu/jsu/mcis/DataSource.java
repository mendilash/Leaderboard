package edu.jsu.mcis;


import java.io.*;
import java.util.*;

public class DataSource{
	
	List<Student> sList;
	List<Course> cList;
	String line;
	Scanner scanner;
	int index;
	
	public DataSource(){
		sList = new ArrayList<>();
		cList = new ArrayList<>();
		line = null;
		scanner = null;
		index = 0;
	}
	
	public List getStudent(String id) throws IOException{
		BufferedReader studentReader = new BufferedReader(new FileReader("src/test/resources/students.csv"));
		
		while ((line = studentReader.readLine()) != null) {
			Student s = new Student(id);
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
		
		return sList;
	}
	
	public List getCourse(String id) throws IOException{
		BufferedReader courseReader = new BufferedReader(new FileReader("src/test/resources/courses.csv"));	
	
		while ((line = courseReader.readLine()) != null) {
			Course c = new Course();
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
		
		return cList;
	}

}