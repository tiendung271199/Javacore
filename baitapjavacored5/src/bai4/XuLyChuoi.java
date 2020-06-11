package bai4;

import java.util.Scanner;

public class XuLyChuoi {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Nhập vào 1 chuỗi: ");
		String s = input.nextLine();

		for (int i = 0; i < s.length(); i++) {
			System.out.println(s.charAt(i));
		}
		System.out.println("Số từ có trong chuỗi '" + s + "': " + s.length());
		String[] s2 = s.split(" ");
		for (int i = s2.length - 1; i >= 0; i--) {
			System.out.print(s2[i] + " ");
		}
		
	}
}
