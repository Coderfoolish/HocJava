package LTHDT;

import java.util.Scanner;

public class bai3 {
	float r;

	public void nhap() {
		Scanner scan = new Scanner(System.in);
	}

	public void menu() {
		Scanner scan = new Scanner(System.in);
		int choice;
		while (true) {
			System.out.println("Menu:");
			System.out.println("1. Tính chu vi cuả hình tròn");
			System.out.println("2. Tính diện tích của hình tròn");
			System.out.println("3. Thoát");
			System.out.print("Chọn tùy chọn (1/2/3): ");
			choice = scan.nextInt();

			switch (choice) {
			case 1:
				System.out.print("Nhap ban kinh r(cm) = ");
				float r = scan.nextFloat();
				float chuViHinhTron = chuVi(r);
				System.out.println("Chu vi hình hình tròn là: " + chuViHinhTron + " (cm)");
				break;
			case 2:
				System.out.print("Nhap ban kinh r(cm) = ");
				float r1 = scan.nextFloat();
				float dienTichHinhTron = dienTich(r1);
				System.out.println("Diện tích hình hình tròn là: " + dienTichHinhTron + " (cm^2)");
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

	public static float chuVi(float r) {
		float cv = (float) (2 * Math.PI * r);
		return cv;
	}

	public static float dienTich(float r) {
		float dt = (float) (Math.PI * r * r);
		return dt;
	}
}
// ép kiểu cho Pi , chú ý đặt biến cho hàm để ép kiểu float ....