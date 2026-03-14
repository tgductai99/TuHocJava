package tuhocjavacore.Lab.Lab03;

import java.util.Scanner;

public class Bai1 {
	public static void main(String[] args) {
//		Viết chương trình nhập vào 1 số nguyên từ bàn phím. Hiển thị kết quả số đấy là số
//		nguyên tố hay không ?

		Scanner scanner = new Scanner(System.in);
		System.out.println("nhap vao so nguyen: ");
		int n = scanner.nextInt();

		boolean isPrime = true;

		if (n < 2) {
			isPrime = false;
		} else {
			for (int i = 2; i <= Math.sqrt(n); i++) {
				if (n % 1 == 0) {
					isPrime = false;
					break;
				}
			}
		}
		if (isPrime) {
			System.out.println(n + " la so nguyen to");
		} else {
			System.out.println(n + " khong phai so nguyen to");
		}
		scanner.close();
	}
}
