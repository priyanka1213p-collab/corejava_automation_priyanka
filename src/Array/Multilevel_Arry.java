package Array;
import java.util.Scanner;

class Admin_class{
	Scanner scn=new Scanner(System.in);
	int id[];
	String name[];
	int size;
	public Admin_class() {
	
		System.out.println("enter student size");
		size=scn.nextInt();
		id=new int[size];
		name=new String[size];
		
		System.out.println("enter student id and name");
		for(int i=0;i<size;i++) {
			id[i]=scn.nextInt();
			name[i]=scn.next();
		}
		// TODO Auto-generated constructor stub
	}
	void display() {
		for(int i=0;i<size;i++) {
			System.out.print(id[i]+" "+name[i]);
		}
	}
}
class Student_class extends Admin_class{
	int subject_size;
	String sub_name[];
	public Student_class() {
		System.out.println("enter subject size ");
		subject_size=scn.nextInt();
		sub_name=new String[subject_size];
		
		System.out.println("enter subject name");
		for(int i=0;i<subject_size;i++) {
			sub_name[i]=scn.next();
		}
		
		// TODO Auto-generated constructor stub
	}
	void display() {
		super.display();
		for(int i=0;i<subject_size;i++) {
			System.out.print(sub_name[i]);
		}
	}
	
}
class Result extends Student_class{

	int result[];
	public Result() {
		result=new int[subject_size];
		System.out.println("enter result of subject");
		for(int i=0;i<subject_size;i++) {
			result[i]=scn.nextInt();
		}
	// TODO Auto-generated constructor stub
	}
	void display() {
		super.display();
		for(int i=0;i<subject_size;i++) {
			System.out.print(result[i]);
		}
		
	}
}

public class Multilevel_Arry {
public static void main(String[] args) {
	Result r=new Result();
	r.display();
	
}
}
