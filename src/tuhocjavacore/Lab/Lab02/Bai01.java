package tuhocjavacore.Lab.Lab02;

import java.util.Scanner;

public class Bai01 {
	public static void main(String[] args) {
//		 Cho phương trình ax + b = 0
//				 Viết chương trình nhập vào 2 số nguyên a và b. Tính toán nghiệm của phương trình
//				 trên

		Scanner scanner = new Scanner(System.in);
		System.out.println("nhap vao a, b:");
		int a = scanner.nextInt();
		int b = scanner.nextInt();

		if (a == 0 && b == 0) {
			System.out.println("phương trình có vô số nghiệm");
		} else if (a == 0 && b != 0) {
			System.out.println("phương trình vô nghiệm");
		} else {
			System.out.println("x = " + -b / a);
		}

		scanner.close();
	}
}
