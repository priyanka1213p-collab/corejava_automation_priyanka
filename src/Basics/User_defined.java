package Basics;

import java.util.Scanner;

public class User_defined {
public static void main(String[] args) {
	Scanner scn = new Scanner (System.in);
	
	//Scanner class is used to create dynamic value
	//Create scanenr class
	
	System.out.println("enter student id");
	
	//nextint()=used to take int val at runtime 
	int id= scn.nextInt();
	System.out.println("Enter Student name");
	String name = scn.next();
	
	System.out.println("Enter Staudent marks");
	Double marks= scn.nextDouble();
	
	System.out.println(id+"\n"+name+"\n"+marks);
	
	
}

}
