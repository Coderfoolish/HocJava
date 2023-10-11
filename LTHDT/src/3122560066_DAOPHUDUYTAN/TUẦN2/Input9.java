package BT;

import Quanlidanhsachsinhvien.Sinhvien;

import java.util.Arrays;
import java.util.Scanner;

public class Input9 {
    Scanner sc = new Scanner(System.in);
    public String masv;
    public String hoten;
    public String lop;
    public String phai;
    public String noisinh;
    public String nganh;
    public String khoa;
    public String hedaotao;
    public int khoahoc;

    public Input9() {
        this.masv = null;
        this.hoten = null;
        this.lop = null;
        this.phai = null;
        this.noisinh = null;
        this.nganh = null;
        this.khoa = null;
        this.hedaotao = null;
        this.khoahoc = 0;
    }

    public Input9(String masv, String hoten, String lop, String phai, String noisinh, String nganh, String khoa, String hedaotao, int khoahoc) {
        this.masv = masv;
        this.hoten = hoten;
        this.lop = lop;
        this.phai = phai;
        this.noisinh = noisinh;
        this.nganh = nganh;
        this.khoa = khoa;
        this.hedaotao = hedaotao;
        this.khoahoc = khoahoc;
    }

    public String getMasv() {
        return masv;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getPhai() {
        return phai;
    }

    public void setPhai(String phai) {
        this.phai = phai;
    }

    public String getNoisinh() {
        return noisinh;
    }

    public void setNoisinh(String noisinh) {
        this.noisinh = noisinh;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }

    public String getKhoa() {
        return khoa;
    }

    public void setKhoa(String khoa) {
        this.khoa = khoa;
    }

    public String getHedaotao() {
        return hedaotao;
    }

    public void setHedaotao(String hedaotao) {
        this.hedaotao = hedaotao;
    }

    public int getKhoahoc() {
        return khoahoc;
    }

    public void setKhoahoc(int khoahoc) {
        this.khoahoc = khoahoc;
    }

    public void nhap() {
        System.out.println("Nhập mã số sinh viên: ");
        this.masv = sc.nextLine();
        System.out.println("Nhập họ & tên sinh viên: ");
        this.hoten = sc.nextLine();
        System.out.println("Nhập lớp: ");
        this.lop = sc.nextLine();
        System.out.println("Nhập giới tính: ");
        this.phai = sc.nextLine();
        System.out.println("Nhập nơi sinh: ");
        this.noisinh = sc.nextLine();
        System.out.println("Ngành theo học:");
        this.nganh = sc.nextLine();
        System.out.println("Thuộc khoa: ");
        this.khoa = sc.nextLine();
        System.out.println("Chương trình thuộc hệ đào tạo: ");
        this.hedaotao = sc.nextLine();
        System.out.println("Khoá học bắt đầu - kết thúc: ");
        this.khoahoc = sc.nextInt();
    }
    public void xuat() {

        System.out.printf("%-20s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s\n", this.masv, this.hoten, this.lop, this.phai, this.noisinh, this.nganh, this.khoa, this.hedaotao, this.khoahoc);
    }
}
