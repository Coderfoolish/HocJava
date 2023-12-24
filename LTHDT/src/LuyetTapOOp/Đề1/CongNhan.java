package LuyetTapOOp.Đề1;

public class CongNhan extends CanBo{
    private int level ;
    public CongNhan()
    {
        level =0 ;
    }
    public CongNhan(String hoTen , int tuoi , String gioiTinh , String diaChi , int level){
        super(hoTen,tuoi,gioiTinh,diaChi);
        this.level=level;
    }

    @Override
    public void nhapDS() {
        super.nhapDS();
        System.out.println("Nhap bac(1 ->10): " );
        level =sc.nextInt();
    }

    @Override
    public void xuatDS() {
        super.xuatDS();
        System.out.println("Bac " +level);
    }
}
