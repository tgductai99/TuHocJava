package tuhocjavacore.Lab.Lab06;

import java.util.Scanner;

public class Video38 {
	public static void main(String[] args) {
		System.out.println("nhap vao username");
		Scanner scanner = new Scanner(System.in);
		String username = scanner.nextLine();

		System.out.println("nhap vao password: ");
		String password = scanner.nextLine();

		System.out.println("username: " + username + "\npassword: " + password);

		if (username.equals("tai") && password.length() > 6) {
			System.out.println(">>>run me cpmpare tai");
		}

		scanner.close();
	}
}
