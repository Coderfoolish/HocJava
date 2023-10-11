package TUAN3;

import java.util.Scanner;

public class baitap3 extends baitap1 {
    private baitap1 diem1;
    private baitap1 diem2;

    public baitap3() {
        super();
        this.diem1 = new baitap1();
        this.diem2 = new baitap1();
    }

    public baitap3(baitap1 diem1, baitap1 diem2) {
        super();
        this.diem1 = diem1;
        this.diem2 = diem2;
    }

    public void nhapdiem() {
        super.nhap();
        this.diem1.nhap();
        this.diem2.nhap();
    }

    public void xuatdiem() {
        this.diem1.xuat();
        this.diem2.xuat();
    }

    public double tinhKhoangCach() {
        return Math.sqrt((this.diem2.x - this.diem1.x) * (this.diem2.x - this.diem1.x) + (this.diem2.y - this.diem1.y) * (this.diem2.y - this.diem1.y));
    }

    public void menu() {
        baitap1 diem1 = new baitap1();
        baitap1 diem2 = new baitap1();
        baitap3 kc = new baitap3(diem1,diem2);
        Scanner sc = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println();
            System.out.println("+------------------------------+");
            System.out.println("Menu:");
            System.out.println("1. Nhập điểm");
            System.out.println("2. Xuất điểm");
            System.out.println("3. Tính khoảng cách");
            System.out.println("0. Thoát");
            System.out.print("Chọn tùy chọn (0 -> 3): ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    diem1.nhap();
                    diem2.nhap();
                    break;
                case 2:
                    kc.xuatdiem();
                    break;
                case 3:
                    System.out.println("Khoảng cáchh giữa hai điểm d = " + kc.tinhKhoangCach() + " (cm)");
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
}
