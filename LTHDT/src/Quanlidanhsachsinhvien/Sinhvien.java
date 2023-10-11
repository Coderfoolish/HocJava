package Quanlidanhsachsinhvien;

import java.util.Scanner;

public class Sinhvien {
    private String masv;
    public String hoten;
    protected String ngaysinh;
    private String diachi;
    String dienthoai; // khai bao default trong cùng class và package
    private static String noihoc = "DHSG";
    private static int dem = 0;
    Scanner sc = new Scanner(System.in);

    public Sinhvien() {
        this.masv = null;
        this.hoten = null;
        this.ngaysinh = null;
        this.diachi = null;
        this.dienthoai = null;
        dem++;
    }

    public Sinhvien(String masv, String hoten, String ngaysinh, String diachi, String dienthoai) {
        //String thì lấy được số 0 đầu tiên của số điện thoại
        this.masv = masv;
        this.hoten = hoten;
        this.ngaysinh = ngaysinh;
        this.diachi = diachi;
        this.dienthoai = dienthoai;
        dem++;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public void setDienthoai(String dienthoai) {
        this.dienthoai = dienthoai;
    }

    public static void setNoihoc(String noihoc) {
        Sinhvien.noihoc = noihoc;
    }

    public String getMasv() {
        return masv;
    }

    public String getHoten() {
        return hoten;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public String getDiachi() {
        return diachi;
    }

    public String getDienthoai() {
        return dienthoai;
    }

    public static String getNoihoc() {
        return noihoc;
    }

    public void nhapsinhvien() {
        System.out.println("Nhap ma sv:");
        masv = sc.nextLine();
        System.out.println("Nhap hoten:");
        hoten = sc.nextLine();
        System.out.println("Nhap ngay sinh:");
        ngaysinh = sc.nextLine();
        System.out.println("Nhap địa chỉ:");
        diachi = sc.nextLine();
        System.out.println("Nhap điện thoại:");
        dienthoai = sc.nextLine();
    }

    public void xuatsinhvien() {
        //System.out.printf("%-12s%-20s%-12s%-12s%-12s%-12s\n", masv, hoten, ngaysinh, diachi, dienthoai, noihoc);
        System.out.printf("%-12s%-20s%-12s%-25s%-12s%-12s\n" , masv, hoten, ngaysinh, diachi, dienthoai, noihoc);
        //System.out.println(masv +"\t"+ hoten+"\t\t");
    }

//    public static void main(String[] args) {
//        Sinhvien sv1 = new Sinhvien();
//        Sinhvien sv2 = new Sinhvien();
//
////	        sv1.dienthoai="324324";
//        sv1.nhapsinhvien();
//        sv2.nhapsinhvien();
////	        sv2=sv1;
////	        sv2.xuatsinhvien();
//        sv1.xuatsinhvien();
//        sv2.xuatsinhvien();
//
//    }
}

