package sourcecode;

public class SinhVien {

    KiemTra kiemtra = new KiemTra();
    private double DiemMon1, DiemMon2, DiemMon3;
    private String MaSinhVien, HoTen, Lop;

    public double getDiemMon1() {
        return DiemMon1;
    }

    public void setDiemMon1(double DiemMon1) {
        this.DiemMon1 = DiemMon1;
    }

    public double getDiemMon2() {
        return DiemMon2;
    }

    public void setDiemMon2(double DiemMon2) {
        this.DiemMon2 = DiemMon2;
    }

    public double getDiemMon3() {
        return DiemMon3;
    }

    public void setDiemMon3(double DiemMon3) {
        this.DiemMon3 = DiemMon3;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public String getLop() {
        return Lop;
    }

    public void setLop(String Lop) {
        this.Lop = Lop;
    }

    public String getMaSinhVien() {
        return MaSinhVien;
    }

    public void setMaSinhVien(String MaSinhVien) {
        this.MaSinhVien = MaSinhVien;
    }

    public SinhVien() {
    }

    public SinhVien(double DiemMon1, double DiemMon2, double DiemMon3, String MaSinhVien, String HoTen, String Lop) {
        this.DiemMon1 = DiemMon1;
        this.DiemMon2 = DiemMon2;
        this.DiemMon3 = DiemMon3;
        this.MaSinhVien = MaSinhVien;
        this.HoTen = HoTen;
        this.Lop = Lop;
    }

    public void Nhap() {
        System.out.print("Nhập mã sinh viên: ");
        MaSinhVien = kiemtra.KiemTraNhapMaSinhVien();
        System.out.print("Nhập tên sinh viên: ");
        HoTen = kiemtra.KiemTraNhapTenSinhVien();
        System.out.print("Nhập điểm môn 1: ");
        DiemMon1 = kiemtra.KiemTraNhapDiem();
        System.out.print("Nhập điểm môn 2: ");
        DiemMon2 = kiemtra.KiemTraNhapDiem();
        System.out.print("Nhập điểm môn 3: ");
        DiemMon3 = kiemtra.KiemTraNhapDiem();
    }

    public void Xuat() {
        System.out.println("Mã sinh viên: " + MaSinhVien);
        System.out.println("Họ tên: " + HoTen);
        System.out.println("Điểm môn 1: " + DiemMon1);
        System.out.println("Điểm môn 2: " + DiemMon2);
        System.out.println("Điểm môn 3: " + DiemMon3);
        System.out.println("Điểm trung bình: " + TinhDiemTrungBinh());
        System.out.println("Xếp loại: " + XepLoai());
    }

    public double TinhDiemTrungBinh() {
        return (double) (DiemMon1 + DiemMon2 + DiemMon3) / 3;
    }

    public String XepLoai() {
        if (TinhDiemTrungBinh() < 4.0) {
            return "Loại F";
        } else if (TinhDiemTrungBinh() < 5.5) {
            return "Loại D";
        } else if (TinhDiemTrungBinh() < 7.0) {
            return "Loại C";
        } else if (TinhDiemTrungBinh() < 8.5) {
            return "Loại B";
        } else {
            return "Loại A";
        }
    }

    public void Menu() {
        Nhap();
        System.out.println("");
        Xuat();
    }

}
