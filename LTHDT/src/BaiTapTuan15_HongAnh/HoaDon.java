package BaiTapTuan15_HongAnh;
import java.util.Scanner;
public class HoaDon {
    Scanner sc= new Scanner(System.in);
    private String  maSo ;
    private String hoTenKhach ;
    private String ngayLap;
    private String matHang ;
    private int soLuong ;
    public HoaDon(){
    }
    public HoaDon(String maSo, String hoTenKhach, String ngayLap, String matHang, int soLuong) {
        this.maSo = maSo;
        this.hoTenKhach = hoTenKhach;
        this.ngayLap = ngayLap;
        this.matHang = matHang;
        this.soLuong = soLuong;
    }

    public String getMaSo() {
        return maSo;
    }

    public void setMaSo(String maSo) {
        this.maSo = maSo;
    }

    public String getHoTenKhach() {
        return hoTenKhach;
    }

    public void setHoTenKhach(String hoTenKhach) {
        this.hoTenKhach = hoTenKhach;
    }

    public String getNgayLap() {
        return ngayLap;
    }

    public void setNgayLap(String ngayLap) {
        this.ngayLap = ngayLap;
    }

    public String getMatHang() {
        return matHang;
    }

    public void setMatHang(String matHang) {
        this.matHang = matHang;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    public void NhapHD(){
        System.out.println("Nhap ma so hoa dong: ");
        maSo = sc.nextLine() ;
        System.out.println("Nhap ho ten khach hang: ");
        hoTenKhach = sc.nextLine() ;
        System.out.println("Nhap ngay lap hoa don: ");
        ngayLap = sc.nextLine() ;
        System.out.println("Nhap mat hang");
        matHang =sc.nextLine() ;
        System.out.println("Nhap so luong");
        soLuong = sc.nextInt() ;
        }
    public void xuatHD(){
        System.out.println("ma so hoa dong:" + maSo);
        System.out.println("ho ten khach hang:"+ hoTenKhach);
        System.out.println("ngay lap hoa don:"+ ngayLap);
        System.out.println("mat hang"+ matHang);
        System.out.println("so luong"+ soLuong);
    }
}
