package OOPS;

import java.util.Scanner;

//Cube = side³
//Cuboid = length × breadth × height
//Cylinder = π × radius² × height

class Volume{
	//volume of cube
	void volume(int side) {
		System.out.println("volume of cube:" +(side * side * side));
	}
	
	//volume of cuboid 
	void volume (int length, int breadth , int height) {
		System.out.println("volume of cuboid: "+ (length * breadth * height));
	}
	
	// volume of cylinder
	void volume (double radius , double height ) {
		System.out.println("volume of cylinder "+ (3.14  * radius * radius * height));
	}
}


public class VolumeCalculation {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Volume v = new Volume();
		
		//cube 
		System.out.println("Enter side of cube: ");
		int side = sc.nextInt();
		v.volume(side);
		
		//cuboid 
		System.out.println("Enter length of cuboid");
		int length = sc.nextInt();
		System.out.println("Enter breadth of cuboid");
		int breadth = sc.nextInt();
		System.out.println("Enter height of cuboid ");
		int height = sc.nextInt();
		v.volume(length , breadth , height );
		
		//cylinder 
		System.out.println("Enter a radius of cylinder");
		double radius = sc.nextDouble();
		System.out.println("Enter a height of cylinder");
		double h = sc.nextDouble();
		v.volume(radius , h);
		
		sc.close();
		
		
		
		
		
	}

}
