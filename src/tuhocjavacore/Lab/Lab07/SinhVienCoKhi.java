package tuhocjavacore.Lab.Lab07;

public class SinhVienCoKhi extends SinhVien {
	private double scoreCNC;
	private double scorePLC;

	public SinhVienCoKhi(String id, String name, double price, double tax, double scoreCNC, double scorePLC) {
		super(id, name, price, tax);
		// TODO Auto-generated constructor stub
		this.scoreCNC = scoreCNC;
		this.scorePLC = scorePLC;
	}

	public double getScoreCNC() {
		return scoreCNC;
	}

	@Override
	public String toString() {
		return "SinhVienCoKhi [id=" + id + ", name=" + name + ", price=" + price + ", tax=" + tax + ", scoreCNC="
				+ scoreCNC + ", scorePLC=" + scorePLC + ", diem la: " + getDiem() + "]";
	}

	public void setScoreCNC(double scoreCNC) {
		this.scoreCNC = scoreCNC;
	}

	public double getScorePLC() {
		return scorePLC;
	}

	public void setScorePLC(double scorePLC) {
		this.scorePLC = scorePLC;
	}

	@Override
	double getDiem() {
		// TODO Auto-generated method stub
		return (this.scoreCNC + this.scorePLC) / 2;
	}
}
