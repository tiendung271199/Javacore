package bai1;

public class HocSinhChuyenToanDemo {

	public static void main(String[] args) {
		HocSinhChuyenToan objHocSinhChuyenToan = new HocSinhChuyenToan("Dũng", "java38", 9, 6, 8);
		objHocSinhChuyenToan.diemTB(objHocSinhChuyenToan);
		System.out.println(objHocSinhChuyenToan);
		HocSinh objHocSinh = new HocSinh(objHocSinhChuyenToan.getHoTen(), objHocSinhChuyenToan.getLop(), objHocSinhChuyenToan.getToan(), objHocSinhChuyenToan.getLy(), objHocSinhChuyenToan.getHoa());
		objHocSinh.diemTB(objHocSinh);
		System.out.println(objHocSinh);
		
	}

}
