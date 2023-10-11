package TUAN3;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
//        baitap1 diem1 = new baitap1();
//        diem1.nhap();
//
//        baitap1 diem2 = new baitap1();
//        diem2.nhap();
//
//        baitap3 duanThang = new baitap3(diem1, diem2);
//        duanThang.xuatdiem();
//
//        System.out.println("Khoảng cáchh giữa hai điểm d = " + duanThang.tinhKhoangCach() + " (cm)");
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("+----------------------+");
            System.out.println("MENU SIÊU CẤP VIP PRO:");
            System.out.println("1. BÀI1");
            System.out.println("2. BÀI2");
            System.out.println("3. BÀI3");
            System.out.println("4. BÀI4");
            System.out.println("0. Exit!!");
            System.out.print("Chọn chức năng (0-9): ");
            choice = sc.nextInt();

            switch (choice) {
                case 1: {
                    PointColor oop = new PointColor();
                    oop.menu();
                    break;
                }
                case 2: {
                    Student oop = new Student();
                    oop.menu();
                    break;
                }
                case 4: {
                    CatClass oop = new CatClass();
                    oop.menu();
                    break;
                }
                case 3: {
                    baitap3 oop = new baitap3();
                    oop.menu();
                    break;
                }
                case 0: {
                    System.out.println("Chương trình đã thoát thành công !!!");
                    return;
                }
                default: {
                    System.out.println("Sai cú pháp!");
                    break;
                }
            }
        } while (choice != 0);
    }
}
