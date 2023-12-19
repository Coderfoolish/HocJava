package dethi2022_2023;

public class XeBus extends Xe {
    private int soTuyenXe ;
    private int lenghtRoute ;
    public XeBus(){
        soTuyenXe = 0 ;
        lenghtRoute = 0 ;
    }
    public XeBus(String bienSoXe , String mauXe , String nhanHieu , int soTuyenXe , int lenghtRoute){
        super(bienSoXe , mauXe , nhanHieu) ;
        this.soTuyenXe = soTuyenXe ;
        this.lenghtRoute = lenghtRoute ;
    }
    public void nhap()
    {
        super.nhap();
        System.out.println("Nhap so lo trinh: ");
        soTuyenXe = sc.nextInt() ;
        System.out.println("Nhap do dai lo trinh (km): ");
        lenghtRoute = sc.nextInt() ;
    }
    public void xuat(){
        super.xuat();
        System.out.println("So lo trinh: " + soTuyenXe);
        System.out.println("Do dai quan duong: "+ lenghtRoute);
    }
    @Override
    public int phiQuaTram() {
        if (lenghtRoute > 20 )
            return 10000 ;
        return 5000 ;
    }
}
