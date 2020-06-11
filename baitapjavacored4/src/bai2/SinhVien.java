package bai2;

import java.util.Scanner;

public class SinhVien {
	private int maSV;
	private String tenSV;
	
	public SinhVien() {
		
	}

	public SinhVien(int maSV, String tenSV) {
		this.maSV = maSV;
		this.tenSV = tenSV;
	}

	public int getMaSV() {
		return maSV;
	}

	public void setMaSV(int maSV) {
		this.maSV = maSV;
	}

	public String getTenSV() {
		return tenSV;
	}

	public void setTenSV(String tenSV) {
		this.tenSV = tenSV;
	}
	
	public SinhVien setSV(SinhVien sv) {
		Scanner input = new Scanner(System.in);
		System.out.print("Nhập mã sinh viên: ");
		sv.setMaSV(Integer.parseInt(input.nextLine()));
		System.out.print("Nhập tên sinh viên: ");
		sv.setTenSV(input.nextLine());
		return sv;
	}
	
	public String viewSV() {
		return "Mã SV: " + this.maSV + " - Tên SV: " + this.tenSV;
	}
}
