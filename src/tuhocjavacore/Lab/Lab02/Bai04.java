package tuhocjavacore.Lab.Lab02;

import java.util.Scanner;

public class Bai04 {
	public static void main(String[] args) {
//		Bài 4: Viết chương trình tổ chức menu:
//		System.out.println(">> LỰA CHỌN TÍNH NĂNG <<");
//		System.out.println("++ ----------------------------------------- ++");
//		System.out.println("| 1. Giải phương trình bậc nhất |");
//		System.out.println("| 2. Giải phương trình bậc hai |");
//		System.out.println("| 3. Tính số tiền điện |");
//		System.out.println("| 4. Kết thúc |");
//		System.out.println("++ ------------------ ++");
//		Yêu cầu:
//		- Khi nhập vào "tính năng", sẽ thực hiện theo 3 bài tập đã làm ở trên

		System.out.println(">> LỰA CHỌN TÍNH NĂNG <<");
		System.out.println("++ ----------------------------------------- ++");
		System.out.println("| 1. Giải phương trình bậc nhất |");
		System.out.println("| 2. Giải phương trình bậc hai |");
		System.out.println("| 3. Tính số tiền điện |");
		System.out.println("| 4. Kết thúc |");
		System.out.println("++ ------------------ ++");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();

		switch (a) {
		case 1:
			Bai01.main(args);
			break;
		case 2:
			Bai02.main(args);
			break;
		case 3:
			Bai03.main(args);
			break;
		case 4:
			System.out.println("ket thuc");
			break;
		default:
			System.out.println("Lựa chọn không hợp lệ");
		}
		scanner.close();
	}
}
