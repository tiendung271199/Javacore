package bai1;

import java.util.Scanner;

public class ClassBai1 {
	
	public ClassBai1() {
		
	}
	
	//Nhập n thuộc khoảng từ 10 - 100
	public int nhapN() {
		Scanner input = new Scanner(System.in);
		int n;
		do {
			System.out.print("Nhập n(10 - 100): ");
			n = Integer.parseInt(input.nextLine());
		} while (n < 10 || n > 100);
		return n;
	}
	
	//từ 0-n có bao nhiêu số chia hết cho 5
	public void soChiaHetCho5(int n) {
		int soChiaHetCho5 = 0;
		for (int i = 0; i <= n; i++) {
			if (i%5 == 0) {
				soChiaHetCho5++;
			}
		}
		System.out.println("Có " + soChiaHetCho5 + " số chia hết cho 5 trong khoảng từ 0 - " + n);
	}
	
	//từ 0-n có bao nhiêu số chia hết cho 3
	public void soChiaHetCho3(int n) {
		int soChiaHetCho3 = 0;
		for (int i = 0; i <= n; i++) {
			if (i%3 == 0) {
				soChiaHetCho3++;
			}
		}
		System.out.println("Có " + soChiaHetCho3 + " số chia hết cho 3 trong khoảng từ 0 - " + n);
	}

}
