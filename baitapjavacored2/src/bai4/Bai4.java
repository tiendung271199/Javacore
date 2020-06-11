package bai4;

import java.util.Scanner;

public class Bai4 {

	public static void main(String[] args) {
		// Nhập 3 số nguyên từ bàn phím, tìm số nhỏ nhất và in ra
		
		Scanner input = new Scanner(System.in);
		System.out.print("Nhập số thứ nhất: ");
		int so1 = Integer.parseInt(input.nextLine());
		System.out.print("Nhập số thứ hai: ");
		int so2 = Integer.parseInt(input.nextLine());
		System.out.print("Nhập số thứ ba: ");
		int so3 = Integer.parseInt(input.nextLine());
		
		//int min = (so1 < so2) ? so1 : so2;
		//min = (min < so3) ? min : so3;
		
		int min = ((so1 < so2) ? so1 : so2) < so3 ? ((so1 < so2) ? so1 : so2) : so3;
		
		System.out.println("Số nhỏ nhất trong 3 số " + so1 + ", " + so2 + ", " + so3 + " là " + min);
		
		input.close();
	}

}
