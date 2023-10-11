package LTHDT;

import java.util.Scanner;

public class bai2 {
	int n;

	public void nhap() {
		Scanner scan = new Scanner(System.in);
	}

	public void menu() {
		Scanner scan = new Scanner(System.in);
		int choice;
		while (true) {
			System.out.println("Menu:");
			System.out.println("1. Tính chu vi");
			System.out.println("2. Tính diện tích");
			System.out.println("3. Thoát");
			System.out.print("Chọn tùy chọn (1/2/3): ");
			choice = scan.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Nhập chiều dài: ");
				int length = scan.nextInt();
				System.out.println("Nhập chiều rộng: ");
				int width = scan.nextInt();
				int perimeter = chuVi(length, width);
				System.out.println("Chu vi hình chữ nhật là: " + perimeter);
				break;
			case 2:
				System.out.println("Nhập chiều dài: ");
				int length2 = scan.nextInt();
				System.out.println("Nhập chiều rộng: ");
				int width2 = scan.nextInt();
				int area = dienTich(length2, width2);
				System.out.println("Diện tích hình chữ nhật là: " + area);
				break;
			case 3:
				System.out.println("Thoát khỏi chương trình.");
				return;
			default:
				System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
				break;
			}
		}
	}

	public static int chuVi(int a, int b) {
		return 2 * (a + b);
	}

	public static int dienTich(int a, int b) {
		return a * b;
	}
}
