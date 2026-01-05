package Basics;

public class ConditionStatement {
	public static void main(String[] args) {
		int num=-10;
		if(num>0)
		{
			System.out.println("num is positive num"+num);
			
		}
		
		else {
			System.out.println("num is negative num"+num);
		}
		
		
		//check num is even or odd
		int n=16;
		if(n%2==00) {
			System.out.println("num is even num"+n);	
		}
		else  {
			System.out.println("num is odd num"+n);
			
		}
		
		//find largest number among 3 number 
		int a=566;
		int b=20;
		int c=2323;
		if(a>=b && a>=c)
		{
			System.out.println("a is largets num"+a);
		}
		else if(b>=a && b>=c)
		{
			System.out.println("b is largets num"+b);
		}
		else {
			System.out.println(" c is largest num"+c);
		}
		 
		
	}

}
