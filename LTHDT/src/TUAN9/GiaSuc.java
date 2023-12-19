package TUAN9;

import java.util.Random;
import java.util.Scanner;

public class GiaSuc {
    Scanner sc = new Scanner(System.in) ;
    protected String ID_GS;
    protected String tenLoai;
    protected String tiengKeu;

    protected  int n ;

    public GiaSuc() {
        ID_GS = null;
        tiengKeu = null;
        tenLoai = null;
    }

    public GiaSuc(String ID_GS, String tiengKeu, String tenLoai)
    {
        this.ID_GS = ID_GS ;
        this.tenLoai = tenLoai ;
        this.tiengKeu = tiengKeu ;
    }

    public String getID_GS() {
        return ID_GS;
    }
    public void setID_GS()
    {
        ID_GS = null ;
    }
    public void setID_GS(String ID_GS) {
        this.ID_GS = ID_GS;
    }

    public String getTiengKeu() {
        return tiengKeu;
    }
    public void setTiengKieu()
    {
        tiengKeu=null ;
    }
    public void setTiengKeu(String tiengKeu) {
        this.tiengKeu = tiengKeu;
    }

    public String getTenLoai() {
        return tenLoai;
    }
    public void setTenLoai()
    {
        tenLoai = null ;
    }
    public void setTenLoai(String tenLoai) {
        this.tenLoai = tenLoai;
    }

    public void nhap()
    {
        setID_GS();
        setTenLoai();
        setTiengKieu();
    }

//    @Override
//    public String toString() {
//        return "GiaSuc{" +
//                "ID_GS='" + ID_GS + '\'' +
//                ", tenLoai='" + tenLoai + '\'' +
//                ", tiengKeu='" + tiengKeu + '\'' +
//                ", amoutMilk=" + amoutMilk +
//                '}';
//    }
    public void xuat()
    {
        System.out.println("Gia súc vừa nhập :");
        System.out.println(ID_GS +"\t"+ tenLoai+"\t"+ tiengKeu +"\t");
    }
    public void inputSoluongMoiLoai()
    {
        System.out.println("Nhập số lượng: ");
        n = sc.nextInt();
    }
    public int getMilkAmount(){
        return 0;
    }
    public void giveBirth() {
        Random rd = new Random();
        int numKids = rd.nextInt(5); // Sinh ngẫu nhiên 0-4 con
        System.out.println("Sinh ra " + numKids + " con");

        // Thêm số con vừa sinh vào danh sách gia súc
//        for(int i = 0; i < numKids; i++) {
//            GiaSuc newKid = new GiaSuc();
//            GiaSuc.add(newKid);
//        }
    }

}

