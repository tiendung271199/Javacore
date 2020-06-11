package bai3;

import java.util.Scanner;

public class HoKhau extends NhanKhau{
	private String diaChiHienNay;
	private String noiCongTac;
	
	public HoKhau() {
		super();
	}
	
	public HoKhau(String hoTen, String ngaySinh, String gioiTinh, String diaChiHienNay, String noiCongTac) {
		super(hoTen, ngaySinh, gioiTinh);
		this.diaChiHienNay = diaChiHienNay;
		this.noiCongTac = noiCongTac;
	}

	public String getDiaChiHienNay() {
		return diaChiHienNay;
	}

	public void setDiaChiHienNay(String diaChiHienNay) {
		this.diaChiHienNay = diaChiHienNay;
	}

	public String getNoiCongTac() {
		return noiCongTac;
	}

	public void setNoiCongTac(String noiCongTac) {
		this.noiCongTac = noiCongTac;
	}
	
	public HoKhau inputData(HoKhau obj) {
		super.inputData(obj);
		Scanner input = new Scanner(System.in);
		System.out.print("Nhập địa chỉ hiện nay: ");
		obj.setDiaChiHienNay(input.nextLine());
		System.out.print("Nhập nơi công tác: ");
		obj.setNoiCongTac(input.nextLine());
		return obj;
	}
	
	public String toString() {
		return super.toString() + "\nĐịa chỉ hiện nay: " + this.diaChiHienNay + "\nNơi công tác: " + this.noiCongTac;
	}
}
