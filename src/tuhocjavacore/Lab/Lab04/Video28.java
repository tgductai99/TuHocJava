package tuhocjavacore.Lab.Lab04;

public class Video28 {

	public static void main(String[] args) {
		System.out.println("run video 28");

		Student st1 = new Student();
		System.out.println("check object: " + st1.getName() + " age: " + st1.getAge());

		Student st2 = new Student("tai", 27);

		st2.setName("khong phai tai");
		System.out.println("check object: " + st2.getName() + " age: " + st2.getAge());

	}
}
