package bai6;

import java.util.Scanner;

public class Bai6 {

	public static void main(String[] args) {
		// In ra màn hình tam giác có chiều cao n
		
		Scanner input = new Scanner(System.in);
		System.out.print("Nhập vào n: ");
		int n = Integer.parseInt(input.nextLine());
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 2*i - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		input.close();
	}
	
}
