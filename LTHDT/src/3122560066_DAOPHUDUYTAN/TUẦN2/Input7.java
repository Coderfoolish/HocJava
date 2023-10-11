package BT;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Input7 {
    Scanner sc = new Scanner(System.in);

    public int n;
    Input9[] arrsv;

    public Input7() {
        this.n = 0;
        arrsv = null;
    }


    public Input7(int n, Input9[] arrsv) {
        this.n = n;
        this.arrsv = new Input9[n];
        for (int i = 0; i < n; i++)
            this.arrsv[i] = arrsv[i];
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public Input9[] getArrsv() {
        return arrsv;
    }

    public void setArrsv(Input9[] arrsv) {
        this.arrsv = arrsv;
    }

    public void menu() {
        Input7 oop = new Input7();
        int choice;
        while (true) {
            System.out.println();
            System.out.println("+------------------------------+");
            System.out.println("Menu:");
            System.out.println("1. Nhập danh sách sinh viên");
            System.out.println("2. Xuất danh sách sinh viên");
            System.out.println("3. Thêm sinh viên mới vào danh sách (Cần nhập sinh trước khi sài option này)");
            System.out.println("4. Tìm kiếm sinh viên trong danh sách (bằng tên)");
            System.out.println("5. Sắp xếp danh sách theo tên");
            System.out.println("6. Thống kê sinh viên thuộc lớp & khoa");
            System.out.println("7. Sửa ngành sinh viên trong danh sách ");
            System.out.println("8. Xoá sinh viên trong danh sách");
            System.out.println("0. Thoát");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    oop.nhapdssv();
                    break;
                case 2:
                    oop.xuatdssv();
                    break;
                case 3:
                    oop.themsinhvienvippro();
                    break;
                case 4: {
                    Input9[] arrtimkie = new Input9[]{oop.timkiemsinhvien1()};
                    for (Input9 svInput9 : arrtimkie) {
                        svInput9.xuat();
                    }
                    break;
                }
                case 5: {
                    oop.sapxepsinhvien();
                    oop.xuatdssv();
                    break;
                }
                case 6:
                    oop.thongkesinhvien();
                    break;
                case 7: {
                    oop.suanganh();
                    break;
                }
                case 8: {
                    oop.xoasinhvien();
                    break;
                }
                case 0:
                    System.out.println("Thoát chương trình thành công !!!");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
                    break;
            }
        }
    }
    public void nhapdssv() {
        System.out.println("Nhập số lượng sinh viên: ");
        n = Integer.parseInt(sc.nextLine());
        arrsv = new Input9[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Thông tin của sinh viên thứ: " + (i + 1));
            arrsv[i] = new Input9();
            arrsv[i].nhap();
        }
    }

    public void xuatdssv() {
        System.out.println("Danh sách sinh viên vừa nhập: ");
        System.out.println("+---------------------------------------------------------------------------------------------------+");
        System.out.printf("%-20s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s\n", "|Mã sinh viên|", "|Họ&Tên|", "|Lớp|", "|Phái|", "|Nơi sinh|", "|Ngành|", "|Khoa|", "|Hệ đào tạo|", "|Khóa học|");
        System.out.println("+---------------------------------------------------------------------------------------------------+");
        //System.out.println("+--------------------------------%-12s%-20s%-12s%-25s%-12s%-12s\\n\",-------------------------+");
        //for(int i=0; i<arrsv.length; i++)
        for (Input9 objsv : arrsv) {
            //arrsv[i].xuatsinhvien();
            objsv.xuat();
        }
    }

    public void addsv() {
        System.out.println("Nhap thong tin sinh vien can them:");
        Input9 sv = new Input9();
        sv.nhap();
        arrsv = Arrays.copyOf(arrsv, arrsv.length + 1);
        arrsv[n] = sv;
        n++;
    }

    private int binarySearch(Input9[] arrsv, int left, int right, String masv) {
        if (left > right) {
            return -1;
        }

        int mid = (left + right) / 2;

        if (arrsv[mid].getMasv().equalsIgnoreCase(masv)) {
            return mid;
        } else if (arrsv[mid].getMasv().compareTo(masv) < 0) {
            return binarySearch(arrsv, mid + 1, right, masv);
        } else {
            return binarySearch(arrsv, left, mid - 1, masv);
        }
    }
    public Input9 timkiemsinhvien1() {
        Input9 sv = null;
        System.out.println("Nhap vào mã sinh viên cần tim:");
        String masvv = sc.nextLine();

        // Sử dụng phương pháp binary search để tìm kiếm sinh viên
        int index = binarySearch(arrsv, 0, arrsv.length - 1, masvv);

        // Trả về sinh viên nếu tìm thấy
        if (index != -1) {
            sv = arrsv[index];
        }

        return sv;
    }
    public void themsinhvienvippro() {
        System.out.println("Nhập thông tin sinh viên cần thêm:");
        Input9 sv = new Input9();
        sv.nhap();

        // Kiem tra xem sinh vien da ton tai trong danh sach hay chua
        int index = binarySearch(arrsv, 0, arrsv.length - 1, sv.getMasv());
        if (index != -1) {
            System.out.println("Sinh viên đã tồn tại trong danh sách!");
            return;
        }

        // Neu sinh vien chua ton tai thi them vao danh sach
        arrsv = Arrays.copyOf(arrsv, arrsv.length + 1);
        arrsv[n] = sv;
        n++;
    }

    public Input9 timkiemsinhvien() {
        System.out.println("Nhập vào tên sinh viên cần tìm:");
        String tensv = sc.nextLine();

        // Sử dụng phương pháp binary search để tìm kiếm sinh viên
        int index = binarySearch(arrsv, 0, arrsv.length - 1, tensv);

        // Trả về mảng chứa các sinh viên có tên trùng với tên mà người dùng nhập vào
        Input9[] arrtimkiem = new Input9[index + 1];
        for (int i = 0; i <= index; i++) {
            arrtimkiem[i] = arrsv[i];
        }
        return arrtimkiem[0];
    }

    public void sapxepsinhvien() {
        // Sắp xếp danh sách sinh viên theo tên
        for (int i = 0; i < arrsv.length - 1; i++) {
            for (int j = i + 1; j < arrsv.length; j++) {
                if (arrsv[i].getHoten().compareToIgnoreCase(arrsv[j].getHoten()) > 0) {
                    // Hoán đổi vị trí của hai sinh viên
                    Input9 temp = arrsv[i];
                    arrsv[i] = arrsv[j];
                    arrsv[j] = temp;
                }
            }
        }
    }

    public void thongkesinhvien() {
        // Thống kê số lượng sinh viên theo từng khoa
        Map<String, Integer> mapKhoa = new HashMap<>();
        for (Input9 sv : arrsv) {
            String khoa = sv.getKhoa();
            if (!mapKhoa.containsKey(khoa)) {
                mapKhoa.put(khoa, 0);
            }
            mapKhoa.put(khoa, mapKhoa.get(khoa) + 1);
        }

        // Thống kê số lượng sinh viên theo từng lớp
        Map<String, Integer> mapLop = new HashMap<>();
        for (Input9 sv : arrsv) {
            String lop = sv.getLop();
            if (!mapLop.containsKey(lop)) {
                mapLop.put(lop, 0);
            }
            mapLop.put(lop, mapLop.get(lop) + 1);
        }
        // In ra thống kê
        System.out.println("Thống kê số lượng sinh viên theo từng khoa: ");
        for (Map.Entry<String, Integer> entry : mapKhoa.entrySet()) {
            System.out.println("Khoa: " + entry.getKey() + ", Số lượng sinh viên: " + entry.getValue());
        }

        System.out.println("Thống kê số lượng sinh viên theo từng lớp: ");
        for (Map.Entry<String, Integer> entry : mapLop.entrySet()) {
            System.out.println("Lớp: " + entry.getKey() + ", Số lượng sinh viên: " + entry.getValue());
        }
    }

    public void suanganh() {
        System.out.println("Nhập mã số sinh viên cần sửa ngành học: ");
        String masvsua = sc.nextLine();

        // Tìm kiếm sinh viên cần sửa ngành học
        int index = binarySearch(arrsv, 0, arrsv.length, masvsua);
        if (index == -1) {
            System.out.println("Không tìm thấy sinh viên cần sửa ngành học!");
            return;
        }

        // Sửa ngành học của sinh viên
        System.out.println("Nhập ngành học mới: ");
        String nganhmoi = sc.nextLine();
        arrsv[index].setNganh(nganhmoi);
        System.out.println("Sửa ngành học của sinh viên thành công!");
    }

    public void xoasinhvien() {
        // Xóa sinh viên trong danh sách
        System.out.println("Nhập mã số sinh viên cần xóa: ");
        String masvxoa = sc.nextLine();

        // Tìm kiếm sinh viên cần xóa
        int index = binarySearch(arrsv, 0, arrsv.length - 1, masvxoa);
        if (index == -1) {
            System.out.println("Không tìm thấy sinh viên cần xóa!");
            return;
        }

        // Xóa sinh viên khỏi danh sách
        for (int i = index; i < arrsv.length - 1; i++) {
            arrsv[i] = arrsv[i + 1];
        }
        arrsv[arrsv.length - 1] = null;
        arrsv = Arrays.copyOf(arrsv, arrsv.length - 1);

        System.out.println("Xóa sinh viên thành công!");
    }

}
