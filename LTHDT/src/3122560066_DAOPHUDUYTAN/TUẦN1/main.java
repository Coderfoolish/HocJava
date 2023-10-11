package LTHDT;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int chose;
		do {
			System.out.println("MENU SIÊU CẤP VIP PRO:");
			System.out.println("1. BÀI1");
			System.out.println("2. BÀI2");
			System.out.println("3. BÀI3");
			System.out.println("4. BÀI4");
			System.out.println("5. BÀI5");
			System.out.println("6. BÀI6");
			System.out.println("7. BÀI7");
			System.out.println("8. BÀI8");
			System.out.println("9. BÀI9");
			System.out.println("0. Thoát");

			System.out.print("Chọn chức năng (0-9): ");
			chose = sc.nextInt();

			switch (chose) {
			case 1: {
				bai1 test = new bai1();
				test.nhap();
				test.menu();
				break;
			}
			case 2: {
				bai2 test = new bai2();
				test.nhap();
				test.menu();
				break;
			}
			case 3: {
				bai3 test = new bai3();
				test.nhap();
				test.menu();
				break;
			}
			case 4: {
				bai4 test = new bai4();
				test.nhap();
				test.menu();
				break;
			}
			case 5: {
				bai5 test = new bai5();
				test.nhap();
				test.menu();
				break;
			}
			case 6: {
				bai6 test = new bai6();
				test.nhap();
				test.menu();
				break;
			}
			case 7: {
				bai7 test = new bai7();
				test.nhap();
				test.menu();
				break;
			}
			case 8: {
				bai8 test = new bai8();
				test.nhap();
				test.menu();
				break;
			}
			case 9: {
				bai9 test = new bai9();
				test.nhap();
				test.menu();
				break;
			}
			case 0: {
				System.out.println("Chương trình đã thoát.");
				return;
			}
			default: {
				System.out.println("Sai cu phap!");
				break;
			}
			}
		} while (chose != 0);
	}
}
