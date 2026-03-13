package tuhocjavacore.Lab.Lab01;

import java.util.Scanner;

public class bai02 {
	public static void main(String[] args) {
		System.out.println("run bai02");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a, b: ");
		float a = scanner.nextFloat();
		float b = scanner.nextFloat();

		float c = (a + b) * 2;
		float s = a * b;
		float cnn = Math.min(a, b);

		System.out.printf("chu vi: %.2f, dien tich: %.2f, canh nho nhat: %.2f", c, s, cnn);
	}
}
