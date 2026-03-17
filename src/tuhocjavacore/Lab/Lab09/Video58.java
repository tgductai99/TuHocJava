package tuhocjavacore.Lab.Lab09;

import java.util.Scanner;

public class Video58 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		SinhVien sv = null;

		while (true) {
			try {
				System.out.print("Nhap ma SV: ");
				String masv = sc.nextLine();

				System.out.print("Nhap ho ten: ");
				String hoten = sc.nextLine();

				// nhập điểm
				double diem;
				while (true) {
					try {
						System.out.print("Nhap diem: ");
						diem = Double.parseDouble(sc.nextLine());
						if (diem <= 0 || diem >= 10) {
							throw new Exception("Diem khong hop le!");
						}
						break;
					} catch (Exception e) {
						System.out.println("Loi: diem phai la so thuc (0 < diem < 10)");
					}
				}

				// nhập tuổi
				int age;
				while (true) {
					try {
						System.out.print("Nhap tuoi: ");
						age = Integer.parseInt(sc.nextLine());
						if (age <= 18 || age >= 100) {
							throw new Exception("Tuoi khong hop le!");
						}
						break;
					} catch (Exception e) {
						System.out.println("Loi: tuoi phai la so nguyen (18 < age < 100)");
					}
				}

				sv = new SinhVien(masv, hoten, diem, age);
				break;

			} catch (Exception e) {
				System.out.println("Loi nhap du lieu, vui long nhap lai!");
			}
		}

		// in kết quả
		System.out.println("\nThong tin sinh vien:");
		System.out.println(sv);
	}

}
