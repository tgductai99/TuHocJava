package tuhocjavacore.Lab.Lab07;

public class Video421 {
	public static void main(String[] args) {
		System.out.println("run video 42.1");

		SinhVien st1 = new SinhVienIT("1", "tai", 2000, 1, 8.5, 7.75);
		SinhVien st2 = new SinhVienCoKhi("2", "huy", 2000, 1, 6, 9);

		System.out.println(st1);
		st1.getDiem();
		System.out.println(st2);
		st2.getDiem();
	}
}
