package corejava;

import java.util.Scanner;

public class GreatestNumberTernaryOperator {
	public static void main(String[] args) {
		int a, b, c, largest, temp;
		// object of Scanner class
		Scanner sc = new Scanner(System.in);
		// reading input from the user
		System.out.println("Enter A : ");
		a = sc.nextInt();
		System.out.println("Enter B : ");
		b = sc.nextInt();
		System.out.println("Enter C : ");
		c = sc.nextInt();
		// comparing a and b and storing the larger number in a temp variable
		temp = a > b ? a : b;
		// comparing the temp variable with c and storing the result in the variable
		largest = c > temp ? c : temp;
		System.out.println("The largest number is : " + largest);
	}
}
