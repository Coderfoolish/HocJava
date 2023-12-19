/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungchung;

import java.util.Scanner;

/**
 * @author nguyen thanh sang
 */
public class DiaChi {
    private String sonha;
    private String duong;
    private String quan;
    private String thanhpho;
    Scanner sc = new Scanner(System.in);

    public DiaChi() {
        sonha = null;
        duong = null;
        quan = null;
    }

    public DiaChi(String sonha, String duong, String quan, String thanhpho) {
        this.sonha = sonha;
        this.duong = duong;
        this.quan = quan;
        this.thanhpho = thanhpho;

    }

    public DiaChi(DiaChi dc) {
        sonha = dc.sonha;
        duong = dc.duong;
        quan = dc.quan;
        thanhpho = dc.thanhpho;
    }

    public String getSonha() {
        return sonha;
    }

    public void setSonha(String sonha) {
        this.sonha = sonha;
    }

    public String getDuong() {
        return duong;
    }

    public void setDuong(String duong) {
        this.duong = duong;
    }

    public String getQuan() {
        return quan;
    }

    public void setQuan(String quan) {
        this.quan = quan;
    }

    public String getThanhpho() {
        return thanhpho;
    }

    public void setThanhpho(String thanhpho) {
        this.thanhpho = thanhpho;
    }

    public void nhapdiachi() {
        System.out.println("Nhap sonha:");
        sonha = sc.nextLine();
        System.out.println("Nhap duong:");
        duong = sc.nextLine();
        System.out.println("Nhap quan:");
        quan = sc.nextLine();
        System.out.println("Nhap Thanh pho:");
        thanhpho = sc.nextLine();

    }

    public void nhapdiachi(String sonha, String duong, String quan, String thanhpho) {
        this.sonha = sonha;
        this.duong = duong;
        this.quan = quan;
        this.thanhpho = thanhpho;
    }

    public String toString() {
        return sonha + duong + quan + thanhpho;
    }

    public void xuatdiachi() {
        System.out.println(sonha + duong + quan + thanhpho);
    }

}
