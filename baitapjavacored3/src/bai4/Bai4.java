package bai4;

public class Bai4 {
	//Bài tập 4

	public static void main(String[] args) {
		HocVien hv1 = new HocVien();
		hv1.nhapThongTinHocVien(hv1);
		System.out.println(hv1.toString());
		HocVien hv2 = new HocVien();
		hv2.nhapThongTinHocVien(hv2);
		HocVien hv3 = new HocVien();
		hv3.nhapThongTinHocVien(hv3);
		hv1.soSanhDiemTB(hv1, hv2, hv3);
		
	}

}
