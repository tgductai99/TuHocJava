package tuhocjavacore.Lab.Lab01;

import java.util.Scanner;

public class bai03 {
	public static void main(String[] args) {
		System.out.println("run bai03");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap vao canh khoi lap phuong: ");
		int a = scanner.nextInt();

		System.out.println("the tich cua hinh lap phuong la: " + Math.pow(a, 3));
	}
}
