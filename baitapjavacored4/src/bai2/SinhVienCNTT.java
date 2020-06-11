package bai2;

import java.util.Scanner;

public class SinhVienCNTT extends SinhVien {
	private float dToan;
	private float dTin;

	public SinhVienCNTT() {

	}

	public SinhVienCNTT(int maSV, String tenSV, float dToan, float dTin) {
		super(maSV, tenSV);
		this.dToan = dToan;
		this.dTin = dTin;
	}

	public float getdToan() {
		return dToan;
	}

	public void setdToan(float dToan) {
		this.dToan = dToan;
	}

	public float getdTin() {
		return dTin;
	}

	public void setdTin(float dTin) {
		this.dTin = dTin;
	}

	public SinhVienCNTT setSV(SinhVienCNTT sv) {
		super.setSV(sv);
		Scanner input = new Scanner(System.in);
		System.out.print("Nhập điểm toán: ");
		sv.setdToan(Float.parseFloat(input.nextLine()));
		System.out.print("Nhập điểm tin: ");
		sv.setdTin(Float.parseFloat(input.nextLine()));
		return sv;
	}

	public float tongDiem(SinhVienCNTT sv) {
		return sv.dToan + sv.dTin;
	}

	public String viewSV() {
		return super.viewSV() + "\nĐiểm toán: " + this.dToan + " - Điểm tin: " + this.dTin;
	}
}
