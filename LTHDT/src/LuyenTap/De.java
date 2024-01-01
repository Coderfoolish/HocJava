package LuyenTap;

public class De extends DongVat{
    private int soLong ;
    public De(){
    }
    public De(String madv ,String thucAn , String xuatSu, int soLong){
        super(madv, thucAn, xuatSu);
        this.soLong = soLong;
    }

    @Override
    public void nhap() {
        super.nhap();
        System.out.println("Nhap soLong :");
        soLong =sc.nextInt() ;
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println("SoLong :" + soLong);
    }

    @Override
    public double getNhapKho() {
        if (soLong < 3)
            return 200 ;
        return 300 ;
    }
}
