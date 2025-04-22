/*
Q1. Create a Java class named Student to model a university enrollment system.
Requirements:
The class must include private fields: name, course, and durationInMonths.
Implement constructor overloading with:
- One constructor accepting only name
- Another accepting name and course
- Another accepting all three fields
Provide appropriate getters and setters using encapsulation principles.

Define a method getCourseDetails() that returns the course name and duration.
Define a method changeCourse(String newCourse, int newDuration) that allows updating the course.

Write a test class to:
Create student objects using all three constructors.
Invoke all methods and display the results.

*/
import java.util.Scanner;
class Student1{
	private String name ;
	private String course ;
	private int durationInMonths;
	
	
	Student1(String name){
		this.name = name;
	}
	
	Student1(String name , String course){
		this.name = name;
		this.course = course;
		
	}
	
	Student1(String name , String course , int durationInMonths){
		this.name = name;
		this.course = course ;
		this.durationInMonths = durationInMonths;	
	}
	
	public String getCourseDetails(){
		return "Course name : "+course+"\nDuration : "+durationInMonths;
	}
	
	public void changeCourse(String course , int durationInMonths){
		this.course = course;
		this.durationInMonths = durationInMonths;
	}
	
}
class Test2204{
	
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter name :");
		Student1 s1 = new Student1(sc.nextLine()); 
		
		System.out.println("Enter name and course :");
		Student1 s2 = new Student1(sc.nextLine(), sc.nextLine());
		
		System.out.println("Enter name, course and duration of course in months:");
		Student1 s3 = new Student1(sc.nextLine(), sc.nextLine(), sc.nextInt());
		
		System.out.println(s1.getCourseDetails());
		System.out.println(s2.getCourseDetails());
		System.out.println(s3.getCourseDetails());
		
		System.out.println("Do you want to change the course : [0/1]");
		switch (sc.nextInt()){
			case 1 : {System.out.println("Enter course and duration :");
				s3.changeCourse(sc.nextLine(), sc.nextInt());
			s3.getCourseDetails();
			break;}
			case 0 : System.out.println("Thank you!!");
			break;
			default : System.out.println("Invalid Input");
		}
		
	}
}
