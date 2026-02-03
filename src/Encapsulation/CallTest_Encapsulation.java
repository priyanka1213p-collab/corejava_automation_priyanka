package Encapsulation;

public class CallTest_Encapsulation {
public static void main(String[] args) {
	Test_Encapsulation t =  new Test_Encapsulation();
	t.setName("Priya");
	t.setRoll(003);
	
	System.out.println("Student name: " +t.getName());
	System.out.println("Student roll:" +t.getRoll());
}
}
