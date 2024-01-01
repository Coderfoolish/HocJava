package LuyenTap;

import java.util.Scanner;

public class NongTrai {
    Scanner sc= new Scanner (System.in) ;
    DongVat[] dongVats ;
    private int soLuongDv ;
    public void themDongVat() {
        System.out.println("Them BoSua (1)  hoac De(2) , moi ban chon: ");
        int choice = sc.nextInt() ;
        DongVat dongVat = null ;
        if( choice ==1 ) {
            dongVat = new BoSua() ;
        }
        else{
            dongVat = new De() ;
        }
        dongVat.nhap();
        DongVat[] temp = new DongVat[soLuongDv + 1] ;
        for (int i = 0 ; i < soLuongDv ; i++ )
        {
            temp[i] = dongVats[i] ;
        }
        temp[soLuongDv ++ ] = dongVat ;
        dongVats = temp;
        dongVat.xuat();
    }
    public void tinhTien() {
        int tong =0   ;
        for(DongVat dv : dongVats ){
            if( dv instanceof BoSua){
                BoSua bs = (BoSua) dv ;
                tong += bs.getNhapKho();
            }
            else {
                De de = (De) dv ;
                tong += de.getNhapKho();
            }
        }
        System.out.println("Tong tien: " + tong);
    }
}
