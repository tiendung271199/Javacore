package bai5;

import java.util.Scanner;

public class XuLyChuoi {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Nhập vào 1 chuỗi: ");
		String s = input.nextLine();
		System.out.println("Chuỗi vừa nhập: " + s);
		String s2 = s.replace('e', '3').replace('g', '9');
		System.out.println("Chuỗi sau khi thay đổi ký tự: " + s2);
		System.out.print("Chuỗi đảo ngược: ");
		for (int i = s2.length() - 1; i >= 0; i--) {
			System.out.print(s2.charAt(i));
		}

	}

}
