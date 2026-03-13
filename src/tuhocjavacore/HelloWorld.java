package tuhocjavacore;

import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
		int a = 6;
		int b = 9;
		int c = Math.max(a, b);
		System.out.println("max = " + c);

		Scanner scanner = new Scanner(System.in);
		System.out.println("First number: ");
		int n1 = scanner.nextInt();
		System.out.println("Second number: ");
		int n2 = scanner.nextInt();
		System.out.println("Min = " + Math.min(n1, n2));
		scanner.close();
	}
}
