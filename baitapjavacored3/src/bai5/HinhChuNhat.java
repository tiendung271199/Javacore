package bai5;

public class HinhChuNhat {
	private int dai;
	private int rong;
	
	public HinhChuNhat() {
		
	}

	public HinhChuNhat(int dai, int rong) {
		this.dai = dai;
		this.rong = rong;
	}

	public int getDai() {
		return dai;
	}

	public void setDai(int dai) {
		this.dai = dai;
	}

	public int getRong() {
		return rong;
	}

	public void setRong(int rong) {
		this.rong = rong;
	}
	
	//tính chu vi
	public int chuViHCN(HinhChuNhat hcn) {
		return (hcn.dai + hcn.rong)*2;
	}
	
	//tính diện tích
	public int dienTichHCN(HinhChuNhat hcn) {
		return hcn.dai*hcn.rong;
	}
	
	//vẽ hình chữ nhật
	public void veHCN(HinhChuNhat hcn) {
		for (int i = 1; i <= hcn.rong; i++) {
			for (int j = 1; j <= hcn.dai; j++) {
				if (i == 1 || i == hcn.rong) {
					System.out.print("*");
				}
				else {
					if(j == 1 || j == hcn.dai) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
	}
}
