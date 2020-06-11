package bai2;

import java.util.Random;
import java.util.Scanner;

public class ClassBai2 {
	
	public ClassBai2() {
		
	}

	//tạo số ngẫu nhiên
	public int taoSoNgauNhien() {
		Random rd = new Random();
		int n = rd.nextInt(18 - 8 + 1) + 8;
		System.out.println("Số ngẫu nhiên là: " + n);
		return n;
	}
	
	//nhập 1 số từ bàn phím
	public int nhapSo() {
		Scanner input = new Scanner(System.in);
		System.out.print("Nhập vào 1 số: ");
		return Integer.parseInt(input.nextLine());	}
	
	//so sánh số ngẫu nhiên và số nhập từ bàn phím
	public void soSanh(int random, int number) {
		if (random < number) {
			System.out.println("Số ngẫu nhiên < số nhập từ bàn phím");
		} else if (random > number) {
			System.out.println("Số ngẫu nhiên > số nhập từ bàn phím");
		} else {
			System.out.println("Số ngẫu nhiên = số nhập từ bàn phím");
		}
	}
}
