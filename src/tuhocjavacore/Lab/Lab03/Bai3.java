package tuhocjavacore.Lab.Lab03;

import java.util.Arrays;
import java.util.Scanner;

public class Bai3 {
	public static void main(String[] args) {
//		Bài 3: Viết chương trình nhập vào 1 mảng số nguyên bất kỳ:
//		- Sắp xếp và xuất mảng vừa nhập ra màn hình
//		- Xuất phần tử có giá trị nhỏ nhất
//		- Xuất phần tử có giá trị lớn nhất 

		Scanner scanner = new Scanner(System.in);
		System.out.println("nhap vao so luong: ");
		int n = scanner.nextInt();

		int[] arr = new int[n];
		System.out.println("Enter the array element");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}

		System.out.println("mang ban dau: " + Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("mang sap xep: " + Arrays.toString(arr));

		int min = arr[0];
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			min = Math.min(min, arr[i]);
			max = Math.max(max, arr[i]);
		}
		System.out.println("So nho nhat: " + min);
		System.out.println("So lon nhat: " + max);
		scanner.close();
	}
}
