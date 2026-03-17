package tuhocjavacore.Lab.Lab09;

class SinhVien {
	private String masv;
	private String hoten;
	private double diem;
	private int age;

	// Constructor
	public SinhVien(String masv, String hoten, double diem, int age) {
		this.masv = masv;
		this.hoten = hoten;
		this.setDiem(diem); // dùng setter để kiểm tra
		this.setAge(age);
	}

	// Getter & Setter
	public String getMasv() {
		return masv;
	}

	public void setMasv(String masv) {
		this.masv = masv;
	}

	public String getHoten() {
		return hoten;
	}

	public void setHoten(String hoten) {
		this.hoten = hoten;
	}

	public double getDiem() {
		return diem;
	}

	public void setDiem(double diem) {
		if (diem <= 0 || diem >= 10) {
			throw new IllegalArgumentException("Diem phai > 0 va < 10");
		}
		this.diem = diem;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age <= 18 || age >= 100) {
			throw new IllegalArgumentException("Tuoi phai > 18 va < 100");
		}
		this.age = age;
	}

	// toString
	@Override
	public String toString() {
		return "SinhVien{" + "masv='" + masv + '\'' + ", hoten='" + hoten + '\'' + ", diem=" + diem + ", age=" + age
				+ '}';
	}
}