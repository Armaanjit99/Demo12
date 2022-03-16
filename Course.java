package Basiccommands;
import java.util.*;
import java.util.Scanner;
public class Course {
	String cname;
	int duration;
	int fees;
	
	void add(){
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Course Name : ");
		cname = s.next();
		System.out.println("Enter the Course Duration : ");
		duration = s.nextInt();
		System.out.println("Enter the Course Fees : ");
		fees = s.nextInt();
	}
	void display()
	{
		System.out.println("Course Name = " + cname);
		System.out.println("Course Duration = " + duration);
		System.out.println("Course Fees = " + fees);
	}
	
	public static void main(String[] args)
	{
		Course c1 = new Course();
		c1.add();
		c1.display();
	}
		
		
		
	

}
