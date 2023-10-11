package LTHDT;

import java.util.Scanner;

public class bai4 {
	int n;

	public void nhap() {
		Scanner scan = new Scanner(System.in);
	}

	public void menu() {
		Scanner scan = new Scanner(System.in);
		int choice;

		while (true) {
			System.out.println("Menu:");
			System.out.println("1. Kiểm tra số chẵn/lẻ");
			System.out.println("2. Thoát");
			System.out.print("Chọn tùy chọn (1/2): ");
			choice = scan.nextInt();

			switch (choice) {
			case 1:
				System.out.print("Nhập số nguyên n: ");
				int n = scan.nextInt();
				String ketqua = kiemTraChanLe(n);
				System.out.println("Kết quả: " + ketqua);
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

	public static String kiemTraChanLe(int n) {
		if (n % 2 == 0)
			return "Số " + n + " là số chẵn";
		return "Số " + n + " là số lẽ ";
	}

}
