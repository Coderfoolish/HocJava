package BT;

import java.util.Scanner;

public class Input4 {
    public String masv;
    public String hoten;
    public String lop;
    public int diem1;
    public int diem2;
    public int diem3;
    public double avg;
    public String count;

    public Input4() {
        this.masv = null;
        this.hoten = null;
        this.lop = null;
        this.diem1 = 0;
        this.diem2 = 0;
        this.diem3 = 0;
        this.avg = 0.0;
        this.count = null;
    }

    public Input4(String masv, String hoten, String lop, int diem1, int diem2, int diem3) {
        this.masv = masv;
        this.hoten = hoten;
        this.lop = lop;
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
    }

    public String getMasv() {
        return masv;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public int getDiem1() {
        return diem1;
    }

    public void setDiem1(int diem1) {
        this.diem1 = diem1;
    }

    public int getDiem2() {
        return diem2;
    }

    public void setDiem2(int diem2) {
        this.diem2 = diem2;
    }

    public int getDiem3() {
        return diem3;
    }

    public void setDiem3(int diem3) {
        this.diem3 = diem3;
    }

    public void menu() {
        Input4 dt = new Input4();
        Scanner sc = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println();
            System.out.println("+------------------------------+");
            System.out.println("MENU BÀI 4: ");
            System.out.println("1. Nhập đối tượng sinh viên");
            System.out.println("2. Xuất đối tượng sinh viên");
            System.out.println("3. Tính điểm trung bình đối tuọng sinh viên");
            System.out.println("4. Xếp loại cho đối tuọng sinh viên");
            System.out.println("0. Thoát");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    dt.nhap();
                    break;
                case 2:
                    dt.xuat();
                    break;
                case 3: {
                    dt.diemtrungbinh();
                    dt.xuat();
                    break;
                }
                case 4: {
                    dt.count = dt.xeploai();
                    dt.xuat();
                    break;
                }
                case 0:
                    System.out.println("Thoát chương trình thành công!!");
                    return;
                default:
                    System.out.println("Sai cú pháp , vui lòng nhập lại lựa chọn !!");
                    break;
            }

        }
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã số sinh viên: ");
        masv = sc.nextLine();
        System.out.println("Nhập họ tên sinh viên: ");
        hoten = sc.nextLine();
        System.out.println("Nhập lớp : ");
        lop = sc.nextLine();
        System.out.println("Điểm môn thứ 1: ");
        diem1 = sc.nextInt();
        System.out.println("Điểm môn thứ 2: ");
        diem2 = sc.nextInt();
        System.out.println("Điểm môn thứ 3: ");
        diem3 = sc.nextInt();
    }

    public void xuat() {

        System.out.println("+---------------------------------------------------------------------------------------------------+");
        System.out.printf("%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s\n", "|Mã Sv|", "|Họ Tên|", "|Lớp|", "|Điểm 1|", "|Điểm 2|", "|Điểm 3|", "|DTB|", "|Xếp loại|");
        System.out.println("+---------------------------------------------------------------------------------------------------+");
        System.out.printf("%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s\n", masv, hoten, lop, diem1, diem2, diem3, avg, count);
    }

    public void diemtrungbinh() {
        avg = (diem1 + diem2 + diem3) / 3.0;
    }

    public String xeploai() {
        if (avg <= 1) {
            return "Kém";
        } else if (avg <= 3.9) {
            return "Yếu";
        } else if (avg <= 5) {
            return "Trung bình";
        } else if (avg <= 7.9) {
            return "Khá";
        } else {
            return "Giỏi";
        }
    }
}
