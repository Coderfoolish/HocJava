/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polymorphism;

import java.util.Scanner;

/**
 *
 * @author nguyen thanh sang
 */
public class DongVat {
    protected String tendongvat;
    protected double chieucao;
    protected double cannang;
    protected String tiengkeu;
    protected String thucan;
    protected int sochan;
    Scanner sc=new Scanner(System.in);
    public DongVat()
    {
        tendongvat=null;
        chieucao=0;
        cannang=0;
        tiengkeu=null;
        thucan=null;
        sochan=0;
    }
    public DongVat(String tendongvat,double chieucao, double cannang, String tiengkeu, String thucan) {
        this.tendongvat=tendongvat;
        this.chieucao = chieucao;
        this.cannang = cannang;
        this.tiengkeu = tiengkeu;
        this.thucan = thucan;
    }
    public String getTendongvat() {
        return tendongvat;
    }
    
     public void setTendongvat()
    {
        System.out.println("Nhâp tên động vật:");
        tendongvat=sc.nextLine();
    }
    public void setTendongvat(String tendongvat) {
        this.tendongvat = tendongvat;
    }

    public int getSochan() {
        return sochan;
    }
    
    public void setSochan()
    {
        System.out.println("Nhập số chân:");
        sochan=Integer.parseInt(sc.nextLine());
    }
    public void setSochan(int sochan) {
        this.sochan = sochan;
    }

    public double getChieucao() {
        return chieucao;
    }
    public void setChieucao()
    {
        System.out.println("Nhap chiều cao:");
        chieucao=Double.parseDouble(sc.nextLine());
    }
    public void setChieucao(int chieucao) {
        this.chieucao = chieucao;
    }

    public double getCangnang() {
        return cannang;
    }
    
    public void setCannang()
    {
        System.out.println("Nhap cân nặng:");
        cannang=Double.parseDouble(sc.nextLine());
    }
    public void setCannang(int cangnang) {
        this.cannang = cangnang;
    }

    public String getTiengkeu() {
        return tiengkeu;
    }
    
    public void setTiengkeu()
    {
       tiengkeu=null;
    }
    public void setTiengkeu(String tiengkeu) {
        this.tiengkeu=tiengkeu;
    }

    public String getThucan() {
        return thucan;
    }
    
    public void setThucan()
    {
       
        thucan=null;
    }
    public void setThucan(String thucan) {
        this.thucan = thucan;
    }
    public void nhap()
    {
        setTendongvat();
        setChieucao();
        setCannang();
        setTiengkeu();
        setThucan();
        setSochan();
    }
    public String toString()
    {
        return tendongvat+"\t"+chieucao+"\t"+ cannang+"\t"+ sochan+"\t"+ thucan+"\t"+ tiengkeu;
    }
    public void xuat()
    {
        System.out.println("Dong vat vua nhap");
        System.out.println(tendongvat+"\t"+chieucao+"\t"+ cannang+"\t"+ sochan+"\t"+ thucan+"\t"+ tiengkeu);
    }
    public void an()
    {
        System.out.println("Ăn gì đây");
    }
    public void keu()
    {
        System.out.println("Kêu sao đây");
    }
    public void phuongthucdv()
    {
        System.out.println("Phương thức này của động vật");
    }
    public static void main(String[] args) {
        DongVat dv=new DongVat();
        dv.nhap();
        System.out.println(dv);
        
    }
}
