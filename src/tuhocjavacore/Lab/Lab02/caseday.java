package tuhocjavacore.Lab.Lab02;

import java.util.Scanner;

public class caseday {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(">> LỰA CHỌN TÍNH NĂNG <<");
		System.out.println("++ ------------------ ++");
		System.out.println("| 1. Cộng |");
		System.out.println("| 2. Trừ |");
		System.out.println("| 3. Kết thúc |");
		System.out.println("++ ------------------ ++");

		System.out.println("Lựa chọn của bạn là : ");

		int value = scanner.nextInt();

		switch (value) {
		case 1:
			System.out.println("ban da lua chon phep cong");
			break;
		case 2:
			System.out.println("ban da lua chon phep tru");
			break;
		case 3:
			System.out.println("ban da lua chon ket thuc");
			System.exit(0);
		default:
			System.out.println("ban chon thoat chuong trinh");
		}

		scanner.close();
	}
}
