package model;
import model.Student;

public class Main {
	  public static void main(String[] args) {
		  System.out.println("Hi, here is my student information:");
	        Student student = new Student();
	        student.setName("Rafael Perez");
	        System.out.println(student.getName());
	        student.setstudAge(23);
	        System.out.println(student.getstudAge());
	        student.setstudGender("Male");
	        System.out.println(student.getstudGender());
	        student.setstudIDNumber(12345);
	        System.out.println(student.getstudIDNumber());
	    }
	}

