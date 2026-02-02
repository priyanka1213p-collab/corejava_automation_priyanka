package Array;


import java.util.Scanner;

//array is used to store multiple values in a single variable,


//array is a collection of similar type of data,
//size of array is fixed,

//array index starts from 0 to n-1,
//array can be one dimensional or multi dimensional,
//array can be of primitive data type or object data type,
//array is created using 2 ways,

public class Array_Program {
	public Array_Program() {
		
		int arr[]= {12,32,122,33,433,121,222,33};
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		//arr_var[for_loop var]
		// TODO Auto-generated constructor stub
	}
	void display() {		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the elements of array");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
			
		}
		
		System.out.println("Elements of array are:");
		for(int i=0;i<size;i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static void main(String[] args) {
		Array_Program arr=new Array_Program();
		arr.display();
	}

}
