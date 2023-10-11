/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

import java.util.Scanner;

/**
 * @author admin
 */
public class ConNguoi {
    protected String hoten;
    protected String ngaysinh;
    protected String dienthoai;
    protected dungchung.DiaChi dc;
    Scanner inp = new Scanner(System.in);

    public ConNguoi() {
        hoten = "";
        ngaysinh = "";
        dienthoai = "";
        dc = new dungchung.DiaChi();
    }

    public ConNguoi(String hoten, String ngaysinh, dungchung.DiaChi dc, String dienthoai) {

        this.hoten = hoten;
        this.ngaysinh = ngaysinh;
        this.dienthoai = dienthoai;
        this.dc = dc;
    }


    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getDienthoai() {
        return dienthoai;
    }

    public void setDienthoai(String dienthoai) {
        this.dienthoai = dienthoai;
    }

    public dungchung.DiaChi getDc() {
        return dc;
    }

    public void setDc(dungchung.DiaChi dc) {
        this.dc = dc;
    }


    public void nhap() {
        // xuat cau thong bao
        System.out.print("Nhap ho ten:");
        this.hoten = inp.nextLine();
        System.out.print("Nhap ngay sinh:");
        this.ngaysinh = inp.nextLine(); //Nhap chuoi
        dc.nhapdiachi();
        System.out.print("Nhap dien thoai:");
        this.dienthoai = inp.nextLine();

    }

    // Show Student Info
    public void xuat() {
        System.out.print(this.hoten);
        System.out.print(this.ngaysinh);
        //System.out.print(this.diachi);
        dc.xuatdiachi();
        System.out.print(this.dienthoai);

    }

    public static void main(String[] args) {
        ConNguoi a = new ConNguoi();
        a.nhap();
        a.xuat();
    }
}
