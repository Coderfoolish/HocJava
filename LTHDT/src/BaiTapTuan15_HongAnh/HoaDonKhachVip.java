package BaiTapTuan15_HongAnh;

public class HoaDonKhachVip extends HoaDon{
    public HoaDonKhachVip()
    {
    }
    public HoaDonKhachVip(String maSo, String hoTenKhach, String ngayLap, String matHang, int soLuong){
        super(maSo,hoTenKhach,ngayLap,matHang,soLuong);
    }

    @Override
    public void NhapHD() {
        super.NhapHD();
    }
    @Override
    public void xuatHD() {
        super.xuatHD();
    }
}
