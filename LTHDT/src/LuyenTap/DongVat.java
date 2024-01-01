package LuyenTap;

import java.util.Scanner;

public abstract class DongVat {
    Scanner sc = new Scanner(System.in) ;
    private String madv ;
    private String thucAn ;
    private String xuatSu ;

    public DongVat(){

    }
    public DongVat(String madv , String thucAn , String xuatSu){
        this.madv =madv;
        this.thucAn = thucAn;
        this.xuatSu = xuatSu ;
    }

    public String getMadv() {
        return madv;
    }

    public void setMadv(String madv) {
        this.madv = madv;
    }

    public String getGiongLoai() {
        return thucAn;
    }

    public void setGiongLoai(String giongLoai) {
        this.thucAn = giongLoai;
    }

    public String getXuatSu() {
        return xuatSu;
    }

    public void setXuatSu(String xuatSu) {
        this.xuatSu = xuatSu;
    }
    public void nhap(){
        System.out.println("Nhap madv: ");
        madv =sc.nextLine() ;
        System.out.println("Nhap giong loai: ");
        thucAn = sc.nextLine() ;
        System.out.println("Nhap xuat su : ");
        xuatSu =sc.nextLine() ;
    }
    public void xuat(){
        System.out.println("madv: " + getMadv());
        System.out.println("giongloai: "+ getGiongLoai() );
        System.out.println("xuatSu:" + getXuatSu());
    }
    public abstract double getNhapKho () ;
}
