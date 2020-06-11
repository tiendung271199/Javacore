package bai4;

import java.util.Scanner;

public class HocVien {
	private String maHV;
	private String tenHV;
	private String lop;
	private float diemJava;
	private float diemOracle;
	private float diemProject;
	private float diemTB;
	
	public HocVien() {
		
	}

	public String getMaHV() {
		return maHV;
	}

	public void setMaHV(String maHV) {
		this.maHV = maHV;
	}

	public String getTenHV() {
		return tenHV;
	}

	public void setTenHV(String tenHV) {
		this.tenHV = tenHV;
	}

	public String getLop() {
		return lop;
	}

	public void setLop(String lop) {
		this.lop = lop;
	}

	public float getDiemJava() {
		return diemJava;
	}

	public void setDiemJava(float diemJava) {
		this.diemJava = diemJava;
	}

	public float getDiemOracle() {
		return diemOracle;
	}

	public void setDiemOracle(float diemOracle) {
		this.diemOracle = diemOracle;
	}

	public float getDiemProject() {
		return diemProject;
	}

	public void setDiemProject(float diemProject) {
		this.diemProject = diemProject;
	}

	public float getDiemTB() {
		return diemTB;
	}

	public void setDiemTB(float diemTB) {
		this.diemTB = diemTB;
	}
	
	//Nhập thông tin học viên
	public HocVien nhapThongTinHocVien(HocVien hv) {
		Scanner input = new Scanner(System.in);
		System.out.print("Nhập mã HV: ");
		hv.setMaHV(input.nextLine());
		System.out.print("Nhập tên HV: ");
		hv.setTenHV(input.nextLine());
		System.out.print("Nhập lớp: ");
		hv.setLop(input.nextLine());
		System.out.print("Nhập điểm java: ");
		hv.setDiemJava(Float.parseFloat(input.nextLine()));
		System.out.print("Nhập điểm oracle: ");
		hv.setDiemOracle(Float.parseFloat(input.nextLine()));
		System.out.print("Nhập điểm project: ");
		hv.setDiemProject(Float.parseFloat(input.nextLine()));
		hv.setDiemTB(hv.diemTB(hv.getDiemJava(), hv.getDiemOracle(), hv.getDiemProject()));
		return hv;
	}
	
	//tính điểm trung bình
	public float diemTB(float a, float b, float c) {
		float diemTB = (a + b + c)/3;
		return diemTB;
	}
	
	//tìm điểm TB cao nhất
	public void soSanhDiemTB(HocVien hv1, HocVien hv2, HocVien hv3) {
		float max = ((hv1.getDiemTB() > hv2.getDiemTB()) ? hv1.getDiemTB() : hv2.getDiemTB()) > hv3.getDiemTB() ? ((hv1.getDiemTB() > hv2.getDiemTB()) ? hv1.getDiemTB() : hv2.getDiemTB()) : hv3.getDiemTB();
		if (max == hv1.getDiemTB()) {
			System.out.println("Điểm trung bình cao nhất: " + hv1.getTenHV() + " - " + max);
		} else if (max == hv2.getDiemTB()) {
			System.out.println("Điểm trung bình cao nhất: " + hv2.getTenHV() + " - " + max);
		} else if (max == hv3.getDiemTB()) {
			System.out.println("Điểm trung bình cao nhất: " + hv3.getTenHV() + " - " + max);
		}
		
	}
	
	public String toString() {
		return "Mã HV: " + this.maHV + "\nTên học viên: " + this.tenHV + "\nLớp: " + this.lop + "\nĐiểm Java: " + this.diemJava
				+ "\nĐiểm Oracle: " + this.diemOracle + "\nĐiểm Project: " + this.diemProject + "\nĐiểm trung bình: " + this.diemTB;
	}
	
}