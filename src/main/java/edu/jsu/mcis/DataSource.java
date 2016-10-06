package edu.jsu.mcis;


import java.io.*;
import java.util.*;

public class DataSource{
	
	public static void main(String[] args) throws IOException {
		// open file input stream
		BufferedReader reader = new BufferedReader(new FileReader("courses.csv"));

	String line = null;
	Scanner scanner = null;
	int index = 0;
	List<Course> cList = new ArrayList<>();
	
		while ((line = reader.readLine()) != null) {
			Course c = new Course();
			scanner = new Scanner(line);
			scanner.useDelimiter(",");
			while (scanner.hasNext()) {
				String data = scanner.next();
				if (index == 0)
					c.setId(Integer.parseInt(data));
				else if (index == 1)
					c.setSemester(data);
				else if (index == 2)
					c.setYear(data);
				else if (index == 3)
					c.setNumStudents(data);
				else
					System.out.println("invalid data::" + data);
				index++;
			}
			index = 0;
			cList.add(c);
		}
		reader.close();
		
		System.out.println(cList);
	}	
}