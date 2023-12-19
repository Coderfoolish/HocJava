package sourcecode;

import static java.lang.Math.sqrt;
import java.util.Scanner;

public class KiemTra {

    Scanner scanner = new Scanner(System.in);

    public String KiemTraNhapChuoi() {
        String DauVao;
        while (true) {
            DauVao = scanner.nextLine();
            DauVao = DauVao.trim();
            if (DauVao != null) {
                return DauVao;
            } else {
                System.out.print("Không được bỏ trống chuỗi ! Mời nhập lại: ");
            }
        }
    }

    public double KiemTraNhapDiem() {
        double DauVao;
        while (true) {
            try {
                DauVao = Double.parseDouble(scanner.nextLine());
                if (DauVao >= 0 && DauVao <= 10) {
                    return DauVao;
                } else {
                    System.out.print("Điểm không hợp lệ ! Mời nhập lại: ");
                }
            } catch (NumberFormatException exception) {
                System.out.print("Điểm không đúng định dạng ! Mời nhập lại: ");
            }

        }
    }

    public String KiemTraNhapMaSinhVien() {
        String DauVao;
        while (true) {
            DauVao = scanner.nextLine();
            DauVao = DauVao.toUpperCase();
            if (DauVao.matches("SV" + "[0-9]{1,2}")) {
                return DauVao;
            } else {
                System.out.println("Định dạng mã sinh viên: SV__. Ví dụ: SV01");
            }
            System.out.print("Mời nhập lại: ");

        }
    }

    public String KiemTraNhapTenSinhVien() {
        String DauVao;
        while (true) {
            DauVao = scanner.nextLine();
            if (DauVao.matches("[\\pL\\pMn*\\s*]+")) {
                DauVao = DauVao.trim();
                DauVao = DauVao.replaceAll("\\s+", " ");
                DauVao = DauVao.toLowerCase();
                String[] Chuoi = DauVao.split(" ");
                DauVao = "";
                for (int i = 0; i < Chuoi.length; i++) {
                    DauVao += String.valueOf(Chuoi[i].charAt(0)).toUpperCase() + Chuoi[i].substring(1);
                    if (i < Chuoi.length - 1) {
                        DauVao += " ";
                    }
                }
                return DauVao;
            } else {
                System.out.print("Tên sinh viên không hợp lệ ! Mời nhập lại: ");
            }

        }
    }

    public int KiemTraNhapSoNguyen() {
        int DauVao;
        while (true) {
            try {
                DauVao = Integer.parseInt(scanner.nextLine());
                return DauVao;
            } catch (NumberFormatException exception) {
                System.out.print("Sai kiểu dữ liệu ! Nhập lại: ");
            }
        }
    }

    public int KiemTraNhapSoNguyenDuong() {
        int DauVao;
        while (true) {
            DauVao = KiemTraNhapSoNguyen();
            if (DauVao > 0) {
                return DauVao;
            } else {
                System.out.print("Số nhập vào không được nhỏ hơn 0 ! Mời nhập lại: ");
            }
        }
    }

    public boolean LaSoNguyenTo(int DauVao) {
        for (int i = 2; i <= sqrt(DauVao); i++) {
            if (DauVao % i == 0) {
                return false;
            }
        }
        return true;
    }

    public String TiepTuc() {
        String DauVao;
        String DinhDang = "[n|y]";
        while (true) {
            DauVao = scanner.nextLine();
            DauVao = DauVao.toLowerCase();
            if (DauVao.matches(DinhDang)) {
                return DauVao;
            } else {
                System.out.print("Sai định dạng ! Nhập lại: ");
            }
        }
    }

}
