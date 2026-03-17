package tuhocjavacore.Lab.Lab07;

public class SinhVienIT extends SinhVien {
	private double scoreJava;
	private double scoreHTML;

	public SinhVienIT(String id, String name, double price, double tax, double scoreJava, double scoreHTML) {
		super(id, name, price, tax);
		this.scoreHTML = scoreHTML;
		this.scoreJava = scoreJava;
	}

	public double getScoreJava() {
		return scoreJava;
	}

	public void setScoreJava(double scoreJava) {
		this.scoreJava = scoreJava;
	}

	public double getScoreHTML() {
		return scoreHTML;
	}

	public void setScoreHTML(double scoreHTML) {
		this.scoreHTML = scoreHTML;
	}

	public void getMoney() {
		System.out.println("run get Money");
		super.info();
		this.info();
	}

	@Override
	public String toString() {
		return "SinhVienIT [id=" + id + ", name=" + name + ", price=" + price + ", tax=" + tax + ", scoreJava="
				+ scoreJava + ", scoreHTML=" + scoreHTML + ", diem la: " + getDiem() + "]";
	}

	public void info() {
		System.out.println("run info from SinhVienIT");
	}

	@Override
	double getDiem() {
		// TODO Auto-generated method stub
		return ((this.scoreJava * 2) + this.scoreHTML) / 3;
	}
}
