package bai3;

import java.util.Scanner;

public class QuanLyNguoi {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String name = "";
		int ngay = 0, thang = 0, nam = 0;
		int namHienTai = 2020;
		boolean cont = false;
		do {
			try {
				System.out.print("Nhập tên: ");
				name = input.nextLine();
				System.out.print("Nhập ngày sinh: ");
				ngay = Integer.parseInt(input.nextLine());
				System.out.print("Nhập tháng sinh: ");
				thang = Integer.parseInt(input.nextLine());
				System.out.print("Nhập năm sinh: ");
				nam = Integer.parseInt(input.nextLine());

				switch (thang) {
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12:
					cont = false;
					if (ngay < 1 || ngay > 31) {
						cont = false;
						throw new AgeException("Vui lòng nhập ngày trong các tháng 1, 3, 5, 7, 8, 10, 12 từ 1 - 31");
					}
					break;
				case 4:
				case 6:
				case 9:
				case 11:
					cont = false;
					if (ngay < 1 || ngay > 30) {
						cont = false;
						throw new AgeException("Vui lòng nhập ngày trong các tháng 4, 6, 9, 11 từ 1 - 30");
					}
					break;
				case 2:
					cont = false;
					if ((nam % 400 == 0) || (nam % 4 == 0 && nam % 100 != 0)) {
						if (ngay < 1 || ngay > 29) {
							cont = false;
							throw new AgeException("Vui lòng nhập ngày trong tháng 2 nhuận từ 1 - 29");
						}
					} else {
						if (ngay < 1 || ngay > 28) {
							cont = false;
							throw new AgeException("Vui lòng nhập ngày trong tháng 2 không nhuận từ 1 - 28");
						}
					}
					break;
				default:
					throw new AgeException("Vui lòng nhập tháng từ 1 - 12");
				}
				
				if (namHienTai - nam < 13) {
					cont = false;
					throw new AgeException("Tuổi phải lớn hơn 13");
				}
			} catch (NumberFormatException e) {
				cont = true;
				System.out.println("Nhập ngày tháng năm sinh là số");
			} catch (AgeException e) {
				cont = true;
				System.out.println(e.getMessage());
			}
		} while (cont);

		System.out.println("========== THÔNG TIN ==========");
		System.out.println(
				"Tên: " + name + "\nTuổi: " + (namHienTai - nam) + "\nNgày sinh: " + ngay + "/" + thang + "/" + nam);

	}

}
