package bai1;

public class HocSinh {
	private String hoTen;
	private String lop;
	private float toan;
	private float ly;
	private float hoa;
	private float diemTB;
	
	public HocSinh() {
		
	}

	public HocSinh(String hoTen, String lop, float toan, float ly, float hoa) {
		
		this.hoTen = hoTen;
		this.lop = lop;
		this.toan = toan;
		this.ly = ly;
		this.hoa = hoa;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getLop() {
		return lop;
	}

	public void setLop(String lop) {
		this.lop = lop;
	}

	public float getToan() {
		return toan;
	}

	public void setToan(float toan) {
		this.toan = toan;
	}

	public float getLy() {
		return ly;
	}

	public void setLy(float ly) {
		this.ly = ly;
	}

	public float getHoa() {
		return hoa;
	}

	public void setHoa(float hoa) {
		this.hoa = hoa;
	}
	
	public float getDiemTB() {
		return diemTB;
	}

	public void setDiemTB(float diemTB) {
		this.diemTB = diemTB;
	}

	public float diemTB(HocSinh hs) {
		hs.setDiemTB((hs.getToan()+hs.getLy()+hs.getHoa())/3);
		return hs.getDiemTB();
	}
	
	public String toString() {
		return "Họ tên: " + this.hoTen + " - Lớp: " + this.lop + " - Điểm TB: " + this.diemTB;
	}
}
