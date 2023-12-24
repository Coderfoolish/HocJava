package LuyetTapOOp.Đề1;

public class KySu extends CanBo{
    private String major ;
    public KySu()
    {
        major = null ;
    }
    public KySu(String hoTen , int tuoi , String gioiTinh , String diaChi, String major){
        super(hoTen,tuoi,gioiTinh,diaChi);
        this.major= major;
    }

    @Override
    public void nhapDS() {
        super.nhapDS();
        System.out.println("Nhap ngnah dao tao: ");
        major = sc.nextLine();
    }

    @Override
    public void xuatDS() {
        super.xuatDS();
        System.out.println("Nganh dao tao: "+major);
    }
}
