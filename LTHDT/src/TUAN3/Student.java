package TUAN3;

import java.util.Scanner;

public class Student extends baitap2 {
    private String lop;
    private int diem1;
    private int diem2;
    private int diem3;
    public double diemTrungBinh;

    public Student() {
        super();
        this.lop = null;
        this.diem1 = 0;
        this.diem2 = 0;
        this.diem3 = 0;
        this.diemTrungBinh = 0.0;
    }

    public Student(String hoTen, int tuoi, String lop, int diem1, int diem2, int diem3) {
        super(hoTen, tuoi);
        this.lop = lop;
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
    }

    public void diemtrungbinh() {
        diemTrungBinh = (double)(diem1 + diem2 + diem3) / 3.0;
    }
    public void menu()
    {
        Student st = new Student() ;
        Scanner sc = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println();
            System.out.println("+------------------------------+");
            System.out.println("Menu:");
            System.out.println("1. Nhập sinh viên");
            System.out.println("2. Xuất sinh viên");
            System.out.println("3. Điểm trung bình ");
            System.out.println("0. Thoát");
            System.out.print("Chọn tùy chọn (0 -> 3): ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    st.nhapsv();
                    break;
                case 2:
                    st.xuatsv();
                    break;
                case 3:
                    st.diemtrungbinh();
                    break;
                case 0:
                    System.out.println("Thoát khỏi chương trình.");
                    return; // Thoát khỏi chương trình.
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
                    break;
            }
        }
    }
    public void nhapsv() {
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.print("Nhập lớp: ");
        this.lop = sc.nextLine();
        System.out.print("Nhập điểm môn 1: ");
        this.diem1 = sc.nextInt();
        System.out.print("Nhập điểm môn 2: ");
        this.diem2 = sc.nextInt();
        System.out.print("Nhập điểm môn 3: ");
        this.diem3 = sc.nextInt();
    }

    public void xuatsv() {
        super.xuat();
        System.out.printf("%-10s%-10s%-10s%-20s", lop , diem1 , diem2 ,diem3, + diemTrungBinh);
    }
}
