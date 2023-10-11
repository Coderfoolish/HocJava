package LTHDT;

import java.util.Scanner;

public class bai6 {
	int n;

	public void nhap() {
		Scanner scan = new Scanner(System.in);
	}

	public void menu() {
		Scanner scan = new Scanner(System.in);
		int choice;

		while (true) {
			System.out.println("Menu:");
			System.out.println("1. Kiểm tra số nguyên tố");
			System.out.println("2. Thoát");
			System.out.print("Chọn tùy chọn (1/2): ");
			choice = scan.nextInt();

			switch (choice) {
			case 1:
				System.out.print("Nhập số nguyên n: ");
				int n = scan.nextInt();
				String kiemtra = checkIsPrime(n);
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

	public static String checkIsPrime(int n) {
		if (n < 2) {
			return "Số " + n + " không phải là số nguyên tố ! ";
		}
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return "Số " + n + " không phải là số nguyên tố ! ";
			}
		}
		return "Số " + n + " là số nguyên tố ! ";
	}
}