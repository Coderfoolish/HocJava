package BaiTapTuan15_HongAnh;

public class MatHang {
    private String maHang;
    private String tenHang;
    private static double gia ;
    public MatHang()
    {
        maHang = null;
        tenHang = null;
        gia = 0.0 ;
    }
    public MatHang(String maHang, String tenHang , double gia )
    {
        this.maHang = maHang;
        this.tenHang = tenHang ;
        this.gia = gia ;
    }

    public String getMaHang() {
        return maHang;
    }

    public void setMaHang(String maHang) {
        this.maHang = maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public static double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }
}
