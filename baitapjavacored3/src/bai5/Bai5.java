package bai5;

public class Bai5 {
	
	public static void main(String[] args) {
		HinhChuNhat hcn = new HinhChuNhat(20, 5);
		System.out.println("Chu vi = " + hcn.chuViHCN(hcn) + ", Diện tích = " + hcn.dienTichHCN(hcn));
		hcn.veHCN(hcn);
	}

}
