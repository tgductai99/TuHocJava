package tuhocjavacore.Lab.Lab02;

import java.util.Scanner;

public class Bai03 {
	public static void main(String[] args) {
//		Bài 3: Viết chương trình tính số tiền điện (in kết quả ra console)
//		Yêu cầu: nhập vào số điện, sau đấy tính số tiền dựa vào quy luật sau:
//			- Nếu số điện sử dụng từ 0 tới 100, giá mỗi số điện là 1000
//			- Từ số điện 101 (tức là > 100), giá mỗi số điện là 1500

		Scanner scanner = new Scanner(System.in);
		System.out.println("nhap vao so dien:");
		int a = scanner.nextInt();

		int money = (a <= 100) ? a * 1000 : 1500 * a - 50000;
		System.out.println("so tien = " + money);

		scanner.close();
	}
}
