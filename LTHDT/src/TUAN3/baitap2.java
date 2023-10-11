package TUAN3;

import java.util.Scanner;

public class baitap2 {
    private String hoTen;
    private int tuoi;

    public baitap2() {
        this.hoTen = null;
        this.tuoi = 0;
    }

    public baitap2(String hoTen, int tuoi) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập họ và tên: ");
        this.hoTen = sc.nextLine();
        System.out.print("Nhập tuổi : ");
        this.tuoi = Integer.parseInt(sc.nextLine());
    }

    public void xuat() {
        System.out.println("+--------------------------------------------------------------------------------------+");
        System.out.printf("%-10s%-10s%-10s%-10s%-10s%-10s%-20s\n", "|Họ&Tên|", "|Tuổi|", "|Lớp|", "|Điểm1|" , "|Điêm2|" , "|Điểm3 |", "|Điểm Trung Bình|") ;
        System.out.println("+--------------------------------------------------------------------------------------+");
        System.out.printf("%-10s%-10s", hoTen , tuoi);
    }
}
