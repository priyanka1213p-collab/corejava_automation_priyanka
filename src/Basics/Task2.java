package Basics;

import java.util.Scanner;

public class Task2 {
public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    System.out.print("Enter first number: ");
    double a = scn.nextDouble();

    System.out.print("Enter second number: ");
    double b = scn.nextDouble();

    double add = a + b;
    double sub = a - b;
    double mul = a * b;
    double div = a / b;   

    System.out.println("\naddition : " + add);
    System.out.println("sub : " + sub);
    System.out.println("muli : " + mul);
    System.out.println("div : " + div);

}
}