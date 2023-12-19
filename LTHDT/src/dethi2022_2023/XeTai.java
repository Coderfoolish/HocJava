package dethi2022_2023;

public class XeTai extends Xe{
    private int trongTai ;

    public XeTai(){
        trongTai = 0 ;
    }
    public XeTai(String bienSoXe , String mauXe , String nhanHieu  , int trongTai)
    {
        super(bienSoXe , mauXe , nhanHieu) ;
        this.trongTai = trongTai ;
    }
    public void nhap()
    {
        super.nhap();
        System.out.println("Nhap so trong tai(tan): ");
        trongTai =sc.nextInt() ;
    }
    public void xuat()
    {
        super.xuat();
        System.out.println("Trong tai cua xe: " + trongTai );
    }
    @Override
    public int phiQuaTram() {
        if (trongTai < 3 )
            return 15000 ;
        return 30000;
    }
}
