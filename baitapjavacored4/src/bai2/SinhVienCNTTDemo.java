package bai2;

public class SinhVienCNTTDemo {
	
	public static void main(String[] args) {
		SinhVienCNTT objSinhVienCNTT = new SinhVienCNTT();
		objSinhVienCNTT.setSV(objSinhVienCNTT);
		System.out.println(objSinhVienCNTT.viewSV() + "\nTổng điểm: " + objSinhVienCNTT.tongDiem(objSinhVienCNTT));
	}

}
