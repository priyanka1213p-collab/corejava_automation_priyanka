package Basics;

import java.util.Scanner;

public class Day_of_Weeks {
	public static void main(String[] args) {b 
		Scanner sc= new Scanner(System.in);	
		System.out.println(" enter number of day (1-7):");
		int day = sc.nextInt();
		
		switch(day) {
		case 1:
			System.out.println("monday");
			break;
			
		case 2:
			System.out.println("Tuesday");
			break;
			
		case 3:
			System.out.println("Wednesday");
			break;
			
		case 4:
			 System.out.println("thursday");
			 break;
			 
		case 5:
			System.err.println("Friday");
			break;
			
		case 6:
			System.out.println(" Saturday");
			break;
			
		case 7: 
			System.out.println("Sunday");
			break;
		default:
			System.out.println("valid day");	
		}
	}

}
