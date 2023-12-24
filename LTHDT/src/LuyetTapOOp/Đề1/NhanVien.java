package LuyetTapOOp.Đề1;

public class NhanVien extends  CanBo{
    private String congViec ;
    public NhanVien(){
        congViec = null ;
    }
    public NhanVien(String hoTen , int tuoi , String gioiTinh , String diaChi , String congViec){
        super(hoTen,tuoi,gioiTinh,diaChi);
        this.congViec =congViec;
    }

    @Override
    public void nhapDS() {
        super.nhapDS();
        System.out.println("Nhap cong viec: ");
        congViec =sc.nextLine();
    }

    @Override
    public void xuatDS() {
        super.xuatDS();
        System.out.println("Cong viec: " + congViec);
    }
}
