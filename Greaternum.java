package Basiccommands;
import java.util.*;
import java.util.Scanner;
public class Greaternum {

	public static void main(String[] args) {
		int a;
		int b;
		int c;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter first number");
		a = s.nextInt();
		System.out.println("Enter second number");
		b = s.nextInt();
		System.out.println("Enter third number");
		c = s.nextInt();
		
		if(a>b && a>c)
			System.out.println("a is greater");
		else if (b>c)
			System.out.println("b is greater");
			else 
			System.out.println("c is greater");

	}

}
