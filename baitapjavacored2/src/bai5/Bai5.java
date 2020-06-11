package bai5;

import java.util.Random;
import java.util.Scanner;

public class Bai5 {

	public static void main(String[] args) {
		// Mô phỏng trò chơi đoán số				
		
		System.out.println("Trò chơi đoán số - Bạn sẽ nhập 1 số từ 0-5 \nNếu bạn muốn kết thúc vui lòng nhập số 6!");
		
		int diem = 0;
		int soLanDoan = 0;
		int ketQuaDoanTrung = 0;
		
		while (true) {
			Random rd = new Random();
			int number = rd.nextInt(6);
			
			Scanner input = new Scanner(System.in);
			System.out.print("Nhập vào 1 số từ 0-5: ");
			int so = Integer.parseInt(input.nextLine());
			
			if (so == 6) {
				break; // Kêt thúc vòng lặp
			}
			
			soLanDoan++;
			
			if (so == number) {
				diem += 2;
				ketQuaDoanTrung++;
			}
			System.out.println("Số của máy: " + number);
			
		}
		
		float diemTrungBinh = (float)diem/(float)soLanDoan;
		
		System.out.println("Tổng điểm: " + diem);
		System.out.println("Số lần đoán: " + soLanDoan + " lần");
		System.out.println("Kết quả đoán trúng: " + ketQuaDoanTrung + " lần");
		System.out.println("Điểm trung bình: " + diemTrungBinh);
		
		
	}

}
