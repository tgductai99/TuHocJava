package tuhocjavacore.Lab.Lab05;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai01 {

	ArrayList<Double> arr = new ArrayList<Double>();
	Scanner scanner = new Scanner(System.in);

	public void nhapMang() {

		while (true) {
			System.out.print("nhap so: ");
			Double x = scanner.nextDouble();
			arr.add(x);
			scanner.nextLine();
			System.out.print("Nhập thêm (Y/N): ");
			if (scanner.nextLine().equals("N")) { // why using equals ?
				break;
			}
		}
	}

	public void xuatMang() {
		System.out.println("danh sach so:");

		for (Double x : arr) {
			System.out.println(x);
		}
	}

	public void sumArr() {
		double sum = 0;

		for (int i = 0; i < arr.size(); i++) {
			sum += arr.get(i);
		}

		System.out.println("Tong = " + sum);
	}

	public static void main(String[] args) {
		System.out.println("run bai 1");

		Bai01 b1 = new Bai01();
		b1.nhapMang();
		b1.xuatMang();
		b1.sumArr();
	}
}
