package tuhocjavacore.Lab.Lab09;

import java.util.Scanner;

public class Video52 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.print("nhap x: ");
			try {
				int x = scanner.nextInt();

				System.out.println("ketqua 10/x = " + 10 / x);
				break;

			} catch (ArithmeticException e) {
				System.out.println("khong duoc nhap 0!");
			} catch (Exception e) {
				System.out.println("vui long nhap so nguyen!");
				scanner.nextLine(); // clear input sai
			}
		}
		scanner.close();
	}
}
