package corejava;

import java.util.Scanner;

public class EvenOddIfCondition {
	public static void main(String[] args) {
		int a;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a : ");
		a = sc.nextInt();

		if (a % 2 == 0) {
			System.out.println("a is even");
		} else {
			System.out.println("a is odd");
		}
	}
}
