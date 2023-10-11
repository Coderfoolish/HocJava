package LTHDT;

import java.util.Scanner;

public class bai1 {
	int n;

	public void nhap() {
		Scanner scan = new Scanner(System.in);
	}

	public void menu() {
		Scanner scan = new Scanner(System.in);
		int choice;

		while (true) {
			System.out.println("Menu:");
			System.out.println("1. Tính Tổng ");
			System.out.println("2. Tính Hiệu ");
			System.out.println("3. Tính Tích ");
			System.out.println("4. Tính Thương ");
			System.out.println("5. Thoát");
			System.out.print("Chọn tùy chọn (1/2/3/4/5): ");
			choice = scan.nextInt();

			switch (choice) {
			case 1: {
				System.out.println("Nhap a= ");
				int a = scan.nextInt();
				System.out.println("Nhap b= ");
				int b = scan.nextInt();
				Tong(a, b);
				break;
			}
			case 2: {
				System.out.println("Nhap a= ");
				int a = scan.nextInt();
				System.out.println("Nhap b= ");
				int b = scan.nextInt();
				Hieu(a, b);
				break;
			}
			case 3: {
				System.out.println("Nhap a= ");
				int a = scan.nextInt();
				System.out.println("Nhap b= ");
				int b = scan.nextInt();
				Tich(a, b);
				break;
			}
			case 4: {
				System.out.println("Nhap a= ");
				int a = scan.nextInt();
				System.out.println("Nhap b= ");
				int b = scan.nextInt();
				Thuong(a, b);
				break;
			}
			case 5: {
				System.out.println("Thoát khỏi chương trình.");
				return; // Thoát khỏi phương thức menu và chương trình.
			}
			default:
				System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
				break;
			}
		}
	}

	public static void Tong(int a, int b) {
		int sum = a + b;
		System.out.println("Tong la: " + sum + "\n");
	}

	public static void Hieu(int a, int b) {
		int hieu1 = a - b;
		int hieu2 = b - a;
		System.out.println("Nhap lua chon: ");
		System.out.println("1 : số a hiệu b ");
		System.out.println("2 : số b hiệu a ");
		Scanner scannn = new Scanner(System.in);
		int x = scannn.nextInt();

		if (x == 1)
			System.out.println("Hieu giua 2 so a,b la: " + hieu1 + "\n");
		else if (x == 2)
			System.out.println("Hieu giua 2 so a,b la: " + hieu2 + "\n");
		else
			System.out.println("Ban chua nhap lua chon !!");

	}

	public static void Tich(int a, int b) {
		int tich = a * b;
		System.out.print("Tong la: " + tich + "\n");
	}

	public static void Thuong(float a, float b) {
		float thuong1 = a / b;
		float thuong2 = b / a;
		System.out.println("Nhap lua chon: ");
		System.out.println("1 : số a thương b ");
		System.out.println("2 : số b thương a ");
		Scanner scannn = new Scanner(System.in);
		int x = scannn.nextInt();

		if (x == 1)
			System.out.println("Thuong giua 2 so a,b la: " + thuong1 + "\n");
		else if (x == 2)
			System.out.println("Thuong giua 2 so a,b la: " + thuong2 + "\n");
		else
			System.out.println("Ban chua nhap lua chon !!");

	}

}