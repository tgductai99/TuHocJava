package tuhocjavacore.Lab.Lab02;

import java.util.Scanner;

public class tinhThue {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("nhap luong");
		int tax = scanner.nextInt();

		if (tax < 10) {
			System.out.println("khong dong thue");
		} else if (10 <= tax && tax <= 15) {
			System.out.println("thue 10%");
		} else if (15 < tax && tax < 30) {
			System.out.println("thue 20%");
		} else {
			System.out.println("thue 50%");
		}
	}
}
