package Array;

import java.util.Scanner;

public class two_dim {

	void make_2darray() {
		int arr[][]= {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
		for(int i=0;i<4;i++) {
			
			
			for(int j=0;j<3;j++) {
				System.out.print(arr[i][j]+"  ");
			}
			
			System.out.println();
		}
	}
	void runtime_2d() {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter row size");
		int row=scn.nextInt();
		System.out.println("enter coulmn size");
		int column=scn.nextInt();
		int arr[][]=new int[row][column];
		System.out.println("enter elements");
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				arr[i][j]=scn.nextInt();
			}
		}
		
		System.out.println("ypur elements ::");
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				System.out.print(arr[i][j]+"  ");
			}
			System.out.println();
		}
		System.out.println("element in different order");
		for(int i=row-1;i>=0;i--) {
			for(int j=column-1;j>=0;j--) {
				System.out.print(arr[i][j]+"  ");
			}
			System.out.println();
		}
	}
	


}
