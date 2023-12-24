package LuyetTapOOp.Đề1;

import java.util.Scanner;

public class  CanBo {
    Scanner sc=  new Scanner(System.in) ;
    private String hoTen ;
    private int tuoi ;
    private String gioiTinh ;
    private String diaChi ;

    public CanBo()
    {
        hoTen = null;
        tuoi= 0 ;
        gioiTinh =null;
        diaChi = null ;
    }
    public CanBo(String hoTen , int tuoi, String gioiTinh, String diaChi)
    {
        this.hoTen= hoTen;
        this.tuoi = tuoi ;
        this.gioiTinh = gioiTinh;
        this.diaChi =diaChi ;
    }
    public void nhapDS(){
        System.out.println("Nhap ten: ");
        hoTen= sc.nextLine();
        System.out.println("Nhap tuoi");
        tuoi= sc.nextInt();
        System.out.println("Nhap gioi tinh: ");
        gioiTinh =sc.nextLine();
        System.out.println("Nhap dia chi: ");
        diaChi=sc.nextLine();
    }
    public void xuatDS()
    {
        System.out.println("Ten: " +hoTen);
        System.out.println("Tuoi " + tuoi);
        System.out.println("Gioi tinh: " +gioiTinh);
        System.out.println("Dia chi: " + diaChi);
    }
}
