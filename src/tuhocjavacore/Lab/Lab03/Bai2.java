package tuhocjavacore.Lab.Lab03;

import java.util.Scanner;

public class Bai2 {
	public static void main(String[] args) {
//		Bài 2: Viết bảng cửu chương của 1 số nguyên bất kỳ
//		Gợi ý:
//			- Dùng vòng lặp từ 1 tới 10
//			sysout(" %d x %d = %d ", x, i, x*i) vào 1 số nguyên từ bàn phím. 

		Scanner scanner = new Scanner(System.in);
		System.out.println("nhap vao so nguyen: ");
		int n = scanner.nextInt();

		if (n < 1) {
			System.out.println("khong phai so nguyen duong");
		} else {
			for (int i = 1; i <= 10; i++) {
				System.out.printf(" %d x %d = %d \n", n, i, n * i);
			}
		}
		scanner.close();
	}
}
