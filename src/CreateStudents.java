import java.util.*;
import java.io.*;

public class CreateStudents {
	
	public static void main(String[] args){
		Student[] year = new Student[500];

		for(int i = 0; i < 500; i++){
			Student s = new Student();
			String name = "Student" + i;
			s.setName(name);
			year[i] = s;
		} // for 
		
		for (int j = 0; j < 500; j++){
			
			System.out.println(year[j].getName());

		}
	} // createStudent

}
