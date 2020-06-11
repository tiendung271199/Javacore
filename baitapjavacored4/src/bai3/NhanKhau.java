package bai3;

import java.util.Scanner;

public class NhanKhau {
	private String hoTen;
	private String ngaySinh;
	private String gioiTinh;
	
	public NhanKhau() {
		
	}

	public NhanKhau(String hoTen, String ngaySinh, String gioiTinh) {
		this.hoTen = hoTen;
		this.ngaySinh = ngaySinh;
		this.gioiTinh = gioiTinh;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(String ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public String isGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	
	public NhanKhau inputData(NhanKhau obj) {
		Scanner input = new Scanner(System.in);
		System.out.print("Nhập họ tên: ");
		obj.setHoTen(input.nextLine());
		System.out.print("Nhập ngày sinh: ");
		obj.setNgaySinh(input.nextLine());
		System.out.print("Nhập giới tính: ");
		obj.setGioiTinh(input.nextLine());
		return obj;
	}
	
	public String toString() {
		return "Họ tên: " + this.hoTen + "\nNgày sinh: " + this.ngaySinh + "\nGiới tính: " + this.gioiTinh;
	}
}
