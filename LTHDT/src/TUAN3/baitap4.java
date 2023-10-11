package TUAN3;

import java.util.Scanner;

public class baitap4 {
    private String bo;
    private String ho;
    private String ten;
    private int tuoi;

    public baitap4() {
        this.bo = null;
        this.ho = null;
        this.ten = null;
        this.tuoi = 0;
    }

    public String getBo() {
        return bo;
    }

    public void setBo(String bo) {
        this.bo = bo;
    }

    public String getHo() {
        return ho;
    }

    public void setHo(String ho) {
        this.ho = ho;
    }

    public baitap4(String bo, String ho, String ten, int tuoi) {
        this.bo = bo;
        this.ho = ho;
        this.ten = ten;
        this.tuoi = tuoi;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Động vật thuộc bộ gì?  ");
        bo = sc.nextLine();
        System.out.println("Họ của động vật? ");
        ho= sc.nextLine() ;
        System.out.println("Nhập tên của động vật: ");
        ten = sc.nextLine();
        System.out.println("Nhập tuổi của động vật: ");
        tuoi = sc.nextInt();
    }
    public void xuat()
    {
        System.out.println("+-----------------------------------------------------------------------");
        System.out.printf("%-10s%-10s%-10s%-10s%-20s%-200s\n", "|BỘ|", "|Họ|", "|Tên|", "|Tuổi|" , "|Màu Lông|" , "|Tính cách |") ;
        System.out.println("+-----------------------------------------------------------------------+");
        System.out.printf("%-10s%-10s%-10s%-10s", bo , ho , ten , tuoi);
    }

}
