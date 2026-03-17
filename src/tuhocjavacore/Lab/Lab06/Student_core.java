package tuhocjavacore.Lab.Lab06;

import java.util.ArrayList;

public class Student_core {
	public static void main(String[] args) {
		Student st1 = new Student("Nguyễn văn a", "1");
		Student st2 = new Student("Nguyễn văn b", "1");
		Student st3 = new Student("Nguyễn văn c", "1");
		Student st4 = new Student("Nguyễn văn d", "1");
		Student st5 = new Student("Tran văn a", "1");
		Student st6 = new Student("Ha văn a", "1");

		ArrayList<Student> arr = new ArrayList<Student>();
		arr.add(st1);
		arr.add(st2);
		arr.add(st3);
		arr.add(st4);
		arr.add(st5);
		arr.add(st6);

		System.out.println(">>check arr: " + arr);

		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i).getName().startsWith("Nguyễn")) {
				System.out.println("start with Nguyen: " + arr.get(i));
			}
		}
	}
}
