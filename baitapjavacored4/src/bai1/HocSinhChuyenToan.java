package bai1;

public class HocSinhChuyenToan extends HocSinh{

	public HocSinhChuyenToan() {
		super();
	}

	public HocSinhChuyenToan(String hoTen, String lop, float toan, float ly, float hoa) {
		super(hoTen, lop, toan, ly, hoa);
	}
	
	public float diemTB(HocSinhChuyenToan obj) {
		obj.setDiemTB((obj.getToan()*2 + obj.getLy() + obj.getHoa())/4);
		return obj.getDiemTB();
	}
	
	public String toString() {
		return super.toString();
	}
}
