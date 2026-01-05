package Basics;

import java.util.Scanner;

public class Factorialnumber {
public static void main(String[] args) {
	
	Scanner scn = new Scanner(System.in);
	
	System.out.println("Enter a num");
	int n =scn.nextInt();
	
	long fact = 1; 
	for(int i=1;  i<=n; i++ ){
		
	
	 fact = fact * i;
	}
	
	 System.out.println("Factorail of " + n + "="  + fact);
			 
	
			
	
}
}
