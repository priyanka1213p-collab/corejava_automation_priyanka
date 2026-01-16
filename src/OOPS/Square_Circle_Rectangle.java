package OOPS;

import java.util.Scanner;

//public class Square_Circle_Rectangle {
	class Area{
		// Area of square
		void area (int side) {
			System.out.println("Area of Square: "  +(side  * side ));
			
		}
		
		//Are of Rectangle
		void area(int length , int breadth) {
			System.out.println("Area of Rectangle: "+ (length * breadth));
		}
		
		
		//Are of circle
		void area(double radius ) {
			System.out.println("Area of circle :" + (3.14 * radius * radius ));
		}	
		
	}
	public class Square_Circle_Rectangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Area a = new Area();
		
		
		//square 
		System.out.println("Enter a side of Square");
		int side = sc.nextInt();
		a.area(side);
		
		// rectangle 
		System.out.println("Enter a length of rectangle :");
		int length = sc.nextInt();
		System.out.println("Enter a breadth of rectangle :");
		int breadth = sc.nextInt();
		a.area(length, breadth);
		
		//circle
		System.out.println("Enter a radius of circle : ");
		double radius = sc.nextDouble();
		a.area(radius);
		
		sc.close();
	}

}
