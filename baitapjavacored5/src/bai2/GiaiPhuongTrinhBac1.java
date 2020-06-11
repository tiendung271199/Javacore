package bai2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GiaiPhuongTrinhBac1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = 0, b = 0;
		float nghiem = 0;
		try {
			System.out.print("Nhập a: ");
			a = input.nextInt();
			System.out.print("Nhập b: ");
			b = input.nextInt();
			if (a == 0) {
				throw new ArithmeticException();
			} else {
				nghiem = -(float) b / (float) a;
			}
			System.out.println("Nghiệm: " + nghiem);
		} catch (InputMismatchException e) {
			System.out.println("Vui lòng nhập vào là số");
		} catch (ArithmeticException e) {
			if (b == 0) {
				System.out.println("Phương trình vô số nghiệm");
			} else {
				System.out.println("Phương trình vô nghiệm");
			}
		}

	}

}
