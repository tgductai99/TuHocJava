package tuhocjavacore.Lab.Lab01;

import java.util.Scanner;

public class bai01 {
	public static void main(String[] args) {
		System.out.println("Run bai01");

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your name:");
		String name = scanner.nextLine();
		System.out.println("Enter your scores:");
		float scores = scanner.nextFloat();
		System.out.printf("Your name is: %s \nYour scores is: %.2f", name, scores);
	}
}
