package TUAN3;

import java.util.Scanner;

public class CatClass extends baitap4 {
    private String maulong;
    private String tinhcach;

    public CatClass() {
        super();
        this.maulong = null;
        this.tinhcach = null;
    }

    public CatClass(String bo, String ho, String ten, int tuoi, String maulong, String tinhcach) {
        super(bo, ho, ten, tuoi);
        this.maulong = maulong;
        this.tinhcach = tinhcach;
    }

    public void menu() {
        CatClass cl = new CatClass();
        Scanner sc = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println();
            System.out.println("+------------------------------+");
            System.out.println("Menu:");
            System.out.println("1. Nhập động vật");
            System.out.println("2. Xuất động vật");
            System.out.println("0. Thoát");
            System.out.print("Chọn tùy chọn (0 -> 2): ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    cl.nhapcat();
                    break;
                case 2:
                    cl.xuatcat();
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

    public void nhapcat() {
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.println("Nhập màu lông: ");
        maulong = sc.nextLine();
        System.out.println("Nhập tính cách của nó: ");
        tinhcach = sc.nextLine();
    }

    public void xuatcat() {
        super.xuat();
        System.out.printf("%-20s%-20s", maulong, tinhcach);
    }
}
