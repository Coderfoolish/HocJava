package dethi2022_2023;

import java.util.Scanner;

public class DSXe{
    Scanner sc= new Scanner(System.in) ;
    Xe[] mangXe ;
    private int soLuong ;
    public void tongTien()
    {
        int tong = 0 ;
        for (Xe xe : mangXe)
        {
            if (xe instanceof XeBus){
                XeBus bus = (XeBus) xe;
                tong += bus.phiQuaTram() ;
            }
            else {
                XeTai tai = (XeTai) xe;
                tong += tai.phiQuaTram() ;
            }
        }
        System.out.println("Tong tien: " + tong ) ;
    }
    public void themXe()
    {
        System.out.println("(1) them xeTai , (2) them xeBus , moi ban chon: ");
        int choice = sc.nextInt() ;
        Xe xe = null ;
        if(choice == 1)
            xe = new XeTai() ;
        else
            xe = new XeBus() ;
        xe.nhap();
        Xe[] temp= new Xe[soLuong +1 ] ;
        for ( int i = 0 ; i < soLuong ; i ++ )
        {
            temp[i] = mangXe[i] ;
        }
        temp[soLuong++ ] = xe ;
        mangXe = temp ;
        xe.xuat();
    }

}
