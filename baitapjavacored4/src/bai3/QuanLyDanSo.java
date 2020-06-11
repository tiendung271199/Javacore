package bai3;

public class QuanLyDanSo {

	public static void main(String[] args) {
		NhanKhau objNhanKhau = new NhanKhau();
		System.out.println("============= Nhập thông tin ============");
		objNhanKhau.inputData(objNhanKhau);
		System.out.println("=====================");
		System.out.println(objNhanKhau);

		HoKhau objHoKhau = new HoKhau();
		System.out.println("============= Nhập thông tin ============");
		objHoKhau.inputData(objHoKhau);
		System.out.println("=====================");
		System.out.println(objHoKhau);
	}

}
