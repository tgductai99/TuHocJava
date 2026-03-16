package tuhocjavacore.Lab.Lab05;

import java.util.ArrayList;

public class Video33 {
	public static void main(String[] args) {
		System.out.println("run video 33");

		ArrayList<String> a = new ArrayList<String>();
		a.add("Hỏi Dân IT"); // String
		a.add("26"); // int => autoboxing, compiler tự động convert từ int sang Integer

		System.out.println("a= " + a);

		System.out.println("a1= " + a.get(1));

	}
}
