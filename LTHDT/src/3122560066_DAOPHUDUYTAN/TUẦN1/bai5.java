package LTHDT;

import java.util.Scanner;

public class bai5 {
	int n;

	public void nhap() {
		Scanner scan = new Scanner(System.in);
	}

	public void menu() {
		Scanner scan = new Scanner(System.in);
		int choice;
		while (true) {
			System.out.println("Menu:");
			System.out.println("1. Kiểm tra số âm/dương/zero");
			System.out.println("2. Thoát");
			System.out.print("Chọn tùy chọn (1/2): ");
			choice = scan.nextInt();

			switch (choice) {
			case 1:
				System.out.print("Nhập số nguyên n: ");
				int n = scan.nextInt();
				String kiemtra = kiemTraAm_Duong_Zero(n);
				System.out.println("Kết quả: " + kiemtra);
				break;
			case 2:
				System.out.println("Thoát khỏi chương trình.");
				return;
			default:
				System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
				break;
			}
		}
	}

	public static String kiemTraAm_Duong_Zero(int n) {
//		if (n > 0)
//			return "So " + n +"la so Duong" ;
//		if else ( n ==0 )
//			return "So " + n +"la so Zero " ;
//		else 
//			return "So " + n + "la so Am" ;
		if (n > 0) {
			return "Số " + n + " là số dương";
		} else if (n == 0) {
			return "Số " + n + " là số Zero";
		} else {
			return "Số " + n + " là số âm";
		}
	}
}
