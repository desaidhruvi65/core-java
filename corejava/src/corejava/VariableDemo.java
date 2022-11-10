package corejava;

import java.util.Scanner;

public class VariableDemo {

	public static void main(String[] args) {
		// declaring variables
		int a, b, c;
		// creating object of Scanner class
		Scanner sc = new Scanner(System.in);
		// taking user input
		System.out.println("Enter A : ");
		a = sc.nextInt();
		System.out.println("Enter B : ");
		b = sc.nextInt();
		c = a + b;
		System.out.println("C : " + c);
	}

}
