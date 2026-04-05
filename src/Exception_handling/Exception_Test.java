package Exception_handling;

public class Exception_Test {
public static void main(String[] args) {
	int a = 10;
	int b = 0;
	try {
	int result = (a/b);
	System.out.println(result);
	}
	catch(ArithmeticException e) {
		System.out.println("can not divided by zero");
	}
	System.out.println("Progrem continue");
}
}


