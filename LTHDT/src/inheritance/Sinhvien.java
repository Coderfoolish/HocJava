/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

import dungchung.*;

import java.util.Scanner;

//import java.io.Serializable;
public class Sinhvien extends ConNguoi {

    protected String masv;
    Scanner sc = new Scanner(System.in);
    protected String noihoc;

    public Sinhvien() {
        super();
        masv = null;
        noihoc = null;
    }

    public Sinhvien(String masv, String hoten, String ngaysinh, DiaChi dc, String dienthoai, String noihoc) {
        super(hoten, ngaysinh, dc, dienthoai);
        this.masv = masv;
        this.noihoc = noihoc;
    }

    public void nhap() {
        System.out.println("Nhap mã sinh viên:");
        masv = sc.nextLine();
        super.nhap();
        System.out.println("Nhập nơi học");
        noihoc = sc.nextLine();

    }

    public String getNoihoc() {
        return noihoc;
    }

    public void setNoihoc(String noihoc) {
        this.noihoc = noihoc;
    }

    @Override
    public void xuat() {
        //System.out.printf("%-12s%-20s%-12s%-5s%-5s%-5s%-15s%-17s%-12s\n",masv,hoten,ngaysinh,super.dc.getSonha(),super.dc.getDuong(),super.dc.getQuan() ,super.dc.getThanhpho(), dienthoai,noihoc);
        System.out.printf("%-12s%-20s%-12s%-5s%-17s%-12s\n", masv, hoten, ngaysinh, dc, dienthoai, noihoc);

    }

    public String getMasv() {
        return masv;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public String toString() {

        return "Masv:" + masv + " - Hoten:" + hoten + ":Ngay sinh" + ngaysinh + "So Nha:" + dc.getSonha() + "Duong:" + dc.getDuong() + "TP:" + dc.getThanhpho();
    }

    public static void main(String[] args) {
        Sinhvien sv = new Sinhvien();
        DiaChi dc = new DiaChi("235b", "Khanh Hoi", "Tien THuy", "BenTRe");
        //dc.nhapdiachi();
        Sinhvien sv1 = new Sinhvien("001", "nguyễn va a", "1990", dc, "012", "DHSG");
        System.out.println(sv1);
        //sv.nhap();
        sv1.xuat();
    }

}
