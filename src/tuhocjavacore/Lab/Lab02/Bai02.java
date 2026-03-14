package tuhocjavacore.Lab.Lab02;

import java.util.Scanner;

public class Bai02 {
	public static void main(String[] args) {
//		Bài 2: Cho phương trình: ax^2 + bx + c = 0
//				Viết chương trình nhập vào 3 số nguyên a, b, c. Tính toán nghiệm của phương trình
//				trên

		Scanner scanner = new Scanner(System.in);
		System.out.println("nhap vao a, b, c:");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();

		double delta = 0;

		if (a == 0) {
			if (a == 0 && b == 0) {
				System.out.println("phương trình có vô số nghiệm");
			} else if (a == 0 && b != 0) {
				System.out.println("phương trình vô nghiệm");
			} else {
				System.out.println("x = " + -b / a);
			}
		} else {
			delta = Math.pow(b, 2) - 4 * a * c;

			if (delta < 0) {
				System.out.println("phương trình vô nghiệm");
			} else if (delta == 0) {
				System.out.println("nghiệm kép x = " + -b / (2 * a));
			} else {
				System.out.println("x1 = " + (-b + Math.sqrt(delta)) / (2 * a));
				System.out.println("x2 = " + (-b - Math.sqrt(delta)) / (2 * a));
			}
		}
		scanner.close();
	}
}
