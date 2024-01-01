package LuyenTap;

public class BoSua extends  DongVat{
    private int soLuongSua ;
    private int kichThuoc ;
    public BoSua(){
    }
    public BoSua(String madv ,String thucAn , String xuatSu, int soLuongSua , int kichThuoc){
        super(madv, thucAn, xuatSu);
        this.soLuongSua =soLuongSua ;
        this.kichThuoc = kichThuoc;
    }

    @Override
    public void nhap() {
        super.nhap() ;
        System.out.println("Nhap so luong sua :");
        soLuongSua =sc.nextInt() ;
        System.out.println("Nhap kich thuoc: ");
        kichThuoc =sc.nextInt();
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println("SoLuongSua: " + soLuongSua);
        System.out.println("Kich thuoc: " + kichThuoc);
    }

    @Override
    public double getNhapKho() {
        if (soLuongSua  > 20 )
            return 100 ;
        return 50 ;
    }
}
