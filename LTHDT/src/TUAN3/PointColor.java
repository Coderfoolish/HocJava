package TUAN3;

import java.util.Scanner;

public class PointColor extends baitap1 {
    private int color;

    public PointColor() {
        super();
        this.color = 0;
    }

    public PointColor(int x, int y, int color) {
        super(x, y);
        this.color = color;
    }

    public void menu() {
        PointColor diem = new PointColor();
        Scanner sc = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println();
            System.out.println("+------------------------------+");
            System.out.println("Menu:");
            System.out.println("1. Nhập điểm");
            System.out.println("2. Xuất điểm");
            System.out.println("0. Thoát");
            System.out.print("Chọn tùy chọn (0 -> 2): ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    diem.nhapmau();
                    break;
                case 2:
                    diem.xuatmau();
                    break;
                case 0:
                    System.out.println("Thoát khỏi chương trình.");
                    return; // Thoát khỏi chương trình.
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
                    break;
            }
        }
    }

    public void nhapmau() {
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập màu: ");
        color = sc.nextInt();
    }

    public void xuatmau() {
        super.xuat();
        System.out.print("và có màu: " + color);
    }
}
