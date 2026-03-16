package tuhocjavacore.Lab.Lab04;

public class Video30 {
	public static void main(String[] args) {
		System.out.println("run video 30");

		Product test = new Product();

		Product pr1 = test.nhapThongTin("computer", 1000, 0.1);
		test.xuatThongTin(pr1);

		System.out.println("tax: " + test.getTaxPrice(pr1.getPrice(), pr1.getTax()));
	}
}
