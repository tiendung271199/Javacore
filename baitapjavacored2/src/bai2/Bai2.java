package bai2;

import java.util.Scanner;

public class Bai2 {

	public static void main(String[] args) {
		// Tính tổng các số nguyên từ 1 đến N
		
		Scanner input = new Scanner(System.in);
		System.out.print("Nhập vào số nguyên N: ");
		int N = Integer.parseInt(input.nextLine());
		int sum = 0;
		for (int i = 1; i <= N; i++) {
			sum += i;
		}
		System.out.println("Tổng các số nguyên từ 1 đến " + N + " là: " + sum);
		
		input.close();
	}

}
