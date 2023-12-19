package dethi2022_2023;

import java.util.Scanner;

public abstract class Xe {
    private String bienSoXe ;
    private String mauXe ;
    private String nhanHieu;
    Scanner sc = new Scanner(System.in);
    Xe(){
        bienSoXe = null ;
        mauXe = null ;
        nhanHieu = null ;
    }
    Xe(String bienSoXe , String mauXe , String nhanHieu)
    {
        this.bienSoXe = bienSoXe;
        this.mauXe = mauXe ;
        this.nhanHieu = nhanHieu ;
    }
    public void nhap(){
        System.out.println("Nhap bien so xe: ");
        bienSoXe =sc.nextLine() ;
        System.out.println("Nhap mau xe: ");
        mauXe =sc.nextLine();
        System.out.println("Nhap nhan hieu xe:");
        nhanHieu =sc.nextLine() ;
    }
    public void xuat()
    {
        System.out.println("Bien so xe: " + bienSoXe);
        System.out.println("Mau xe: " + mauXe);
        System.out.println("Nhan hieu:" + nhanHieu);
    }
    abstract public int phiQuaTram();
}

